package comp5111.assignment;

public class StatementCounter {
	private static int StatementInvocations = 0;
	
	public static void addStatementInvocation (int n) {
		StatementInvocations +=n;
	} 
	
	public static int getStatementInvocations() {
		return StatementInvocations;
	}
	
	public static void reset() {
		StatementInvocations = 0;
	}
}
 