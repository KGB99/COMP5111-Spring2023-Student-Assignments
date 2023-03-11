package comp5111.assignment;

import java.util.Iterator;
import java.util.Map;

import soot.*;
import soot.jimple.IntConstant;
import soot.jimple.InvokeExpr;
import soot.jimple.Jimple;
import soot.jimple.Stmt;
import soot.jimple.internal.JIdentityStmt;
import soot.util.Chain;

public class StatementInstrumenter extends BodyTransformer{
	
	static SootClass counterClass;
	static SootMethod addStatementCount;
	
	static {
		counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.StatementCounter");
        addStatementCount = counterClass.getMethod("void addStaticInvocation(int)");
	}
	
	// some commands were taken over from the soot-example project
	protected void internalTransform(Body body, String phase, Map options) {
		// get bodys method
		SootMethod method = body.getMethod();
		
		//debugging
		System.out.println("Instrumenting method: " + method.getSignature());
		
		//get the units body as a chain
		Chain<Unit> units = body.getUnits();
		
		//get a snapshot iterator to iterate the chain
		Iterator<?> stmtIt = units.snapshotIterator();
		
		//iterate over statements
		while (stmtIt.hasNext()) {
			Stmt stmt = (Stmt) stmtIt.next();
			
			//make sure stmt is not a JIdentityStmt
			if (stmt instanceof JIdentityStmt) {
				return;
			}
			
			InvokeExpr incExpr = Jimple.v().newStaticInvokeExpr(addStatementCount.makeRef(), IntConstant.v(1));
			Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);
			units.insertBefore(incStmt, stmt);
		}
		
		return;
	}

}
