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

public class StatementInstrumenter extends BodyTransformer {

	static SootClass counterClass;
	static SootMethod visitStmt;
	int oldlinenr = 0;
	static {
		counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.ClassMapStatement");
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
		
		
		int linestatement = 0;
		// iterate over statements
		while (stmtIt.hasNext()) {
			Stmt stmt = (Stmt) stmtIt.next();

			// make sure stmt is not a JIdentityStmt
			if (stmt instanceof JIdentityStmt) {
				continue;
			}

			
			int linenr = stmt.getJavaSourceStartLineNumber();
			//System.out.println("working on linenr: " + linenr + ", with old linenr " + oldlinenr);
			if (linenr == oldlinenr) {
				linestatement++;
				oldlinenr = linenr;
				//System.out.println("incrementing...");
			} else {
				linestatement = 0;
				oldlinenr = linenr;
			}
		

			ClassMapStatement.addStmt(classname, stmt.toString(), linenr, linestatement);
			//System.out.println("adding line " + linenr + ", " + linestatement);
			//ClassMapStatement.addStmt(classname, stmt.toString(), stmt.getJavaSourceStartLineNumber(), stmt.getJavaSourceStartColumnNumber());
			InvokeExpr visitExpr = null;
			
			visitExpr = Jimple.v().newStaticInvokeExpr(visitStmt.makeRef(), StringConstant.v(classname),
					IntConstant.v(stmt.getJavaSourceStartLineNumber()),
					IntConstant.v(linestatement));
			
			/*
			visitExpr = Jimple.v().newStaticInvokeExpr(visitStmt.makeRef(), StringConstant.v(classname),
					IntConstant.v(stmt.getJavaSourceStartLineNumber()),
					IntConstant.v(stmt.getJavaSourceStartColumnNumber()));
			*/
			Stmt visitStmt = Jimple.v().newInvokeStmt(visitExpr);

			units.insertBefore(visitStmt, stmt);
			
		}

		return;
	}

}
