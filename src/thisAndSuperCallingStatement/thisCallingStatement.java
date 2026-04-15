package thisAndSuperCallingStatement;

public class thisCallingStatement {

	public static void main(String[] args) {
		thisCallingStatement cc = new thisCallingStatement("sourav ");

	}

	public thisCallingStatement() {
		
		System.out.println("const1");
	

	}

	public thisCallingStatement(String name) {
		
		
		System.out.println("const2" + name);

	}
}
