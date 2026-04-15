package superAndThisKeyword;

public class SuperKeyword extends SuperKeyword2{

	public static void main(String[] args) {
		
		
		SuperKeyword bb= new SuperKeyword();
		
		bb.supermethod();

	}
	
	public void supermethod() {
		
		String name="sourav";
		
		System.out.println(name);
		super.supermethod();
	}

}
