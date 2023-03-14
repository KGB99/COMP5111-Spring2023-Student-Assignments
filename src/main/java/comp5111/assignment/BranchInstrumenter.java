package comp5111.assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import soot.*;
import soot.jimple.IntConstant;
import soot.jimple.InvokeExpr;
import soot.jimple.Jimple;
import soot.jimple.Stmt;
import soot.jimple.StringConstant;
import soot.jimple.internal.JIdentityStmt;
import soot.jimple.internal.JIfStmt;
import soot.util.Chain;

public class BranchInstrumenter extends BodyTransformer {

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

			if (stmt instanceof JIfStmt) {
				List<UnitBox> unitboxes = stmt.getUnitBoxes();

				Iterator<UnitBox> unititerator = unitboxes.iterator();
				while (unititerator.hasNext()) {
					UnitBox current = unititerator.next();
					if (true) {// current.isBranchTarget()
						Unit currentUnit = current.getUnit();
						int linenr = currentUnit.getJavaSourceStartLineNumber();
						int columnnr = currentUnit.getJavaSourceStartColumnNumber();
						ClassMapLineBranch.addStmt(classname, stmt.toString(), linenr, columnnr);
						InvokeExpr visitExpr = Jimple.v().newStaticInvokeExpr(visitStmt.makeRef(),
								StringConstant.v(classname), IntConstant.v(linenr), IntConstant.v(columnnr));
						Stmt visitStmt = Jimple.v().newInvokeStmt(visitExpr);
						units.insertBefore(visitStmt, currentUnit);
					}
				}
			}
		}

		return;
	}

}
