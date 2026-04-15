package javaConcepts;

public class MethodAndItsCreation {

	public static void main(String[] args) {

		method2();
		System.out.println(method1());

	}

	public static int method1() {
		int b = 20;
		int a = 10;
		System.out.println("value of a" + "== "+a);
		return b;
	}

	public static void method2() {
		int c=10;
		int sum = c+method1();
		System.out.println(sum);

	}
}
