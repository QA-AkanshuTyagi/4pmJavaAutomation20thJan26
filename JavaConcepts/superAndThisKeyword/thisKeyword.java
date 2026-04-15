package superAndThisKeyword;

public class thisKeyword {
String name= "akanshu";
	public static void main(String[] args) {
		
		
		thisKeyword bb= new thisKeyword();
		
		bb.supermethod();

	}
	
	public void supermethod() {
		
		String name="rahul";
		this.name= name;
		System.out.println(name);
		System.out.println(this.name);
	}

}
