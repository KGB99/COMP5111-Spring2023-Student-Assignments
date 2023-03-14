package comp5111.assignment;

import java.util.Iterator;


import java.util.Map;

import soot.*;
import soot.jimple.IntConstant;
import soot.jimple.InvokeExpr;
import soot.jimple.Jimple;
import soot.jimple.Stmt;
import soot.jimple.StringConstant;
import soot.jimple.internal.JIdentityStmt;
import soot.util.Chain;

public class LineInstrumenter extends BodyTransformer {

	static SootClass counterClass;
	static SootMethod visitStmt;

	static {
		counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.ClassMapLineBranch");
		visitStmt = counterClass.getMethodByName("visitStmt");
	}

	// some commands were taken over from the soot-example project
	protected void internalTransform(Body body, String phase, Map options) {
		// get bodys method
		SootMethod method = body.getMethod();
		String classname = method.getDeclaringClass().getName();
		// debugging
		System.out.println("Instrumenting method: " + method.getSignature());

		// get the units body as a chain
		Chain<Unit> units = body.getUnits();
		// System.out.println(units.size());
		// get a snapshot iterator to iterate the chain
		Iterator<?> stmtIt = units.snapshotIterator();

		// iterate over statements
		while (stmtIt.hasNext()) {
			Stmt stmt = (Stmt) stmtIt.next();

			// make sure stmt is not a JIdentityStmt
			if (stmt instanceof JIdentityStmt) {
				continue;
			}

			int linenr = stmt.getJavaSourceStartLineNumber();
			int columnnr = 0;

			// System.out.println("Adding Statement " + stmt.toString() + "to " +
			// classname);

			ClassMapLineBranch.addStmt(classname, ("linenr " + linenr) , linenr, columnnr);
			// System.out.println("current Classname: " + classname);

			InvokeExpr visitExpr = Jimple.v().newStaticInvokeExpr(visitStmt.makeRef(), StringConstant.v(classname),
					IntConstant.v(stmt.getJavaSourceStartLineNumber()),
					IntConstant.v(0));
			Stmt visitStmt = Jimple.v().newInvokeStmt(visitExpr);
			units.insertBefore(visitStmt, stmt);
			
		}

		return;
	}

}