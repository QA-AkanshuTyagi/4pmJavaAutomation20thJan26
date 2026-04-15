package javaConcepts;

public class StaticAndNonStaticMethod05 {

	public static void main(String[] args) {
		
		StaticAndNonStaticMethod05 vv= new StaticAndNonStaticMethod05();
		method1234("rahul akanshu");
	
		vv.nonstatic();
	}
	public static void m1() {
		
		
	}
	public static void method1234(String name) {
		System.out.println(name);
		m1();
		
	
	}
	public  void nonstatic() {
		int a= 10;
		System.out.println(a);
	
	}
	public  void nonstatic1(String name) {
		nonstatic();
		
	
	}

}
