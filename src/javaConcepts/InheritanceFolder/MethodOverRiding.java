package javaConcepts.InheritanceFolder;

public class MethodOverRiding extends ParentClass {

	public static void main(String[] args) {
	
		MethodOverRiding mm= new MethodOverRiding();
		mm.test1();
		
	}
	
public void test1() {
		super.test1();
		System.out.println("Iam child");
		
	}
	

}
