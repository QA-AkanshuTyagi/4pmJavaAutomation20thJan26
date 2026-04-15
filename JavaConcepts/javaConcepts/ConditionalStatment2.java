package javaConcepts;

public class ConditionalStatment2 {

	public static void main(String[] args) {

		int a = 12;
		int b = 2;
		int c = 3;
		ConditionalStatment2 cc = new ConditionalStatment2();
		// ques: find the largest number among the above three
		// if condition

// if elseif condition

		if (a < c && b < c) {
			System.out.println("c is largest");

		} else if (b < a && c < a) {

			System.out.println("a is largest");

		} else if (a < b && c < b) {

			System.out.println("b is greater");

		}

		cc.runBrowser("firefox");
		// ================================================

		// nested if else condition

		if (a <= 10) {

			if (a >= 9) {
				System.out.println("a is equal to 9");

			} else {

				System.out.println("a is not equal to 9");

			}
		}else {
			
			System.out.println("a is not greater than or equal to 10");
			
		}

	}

	public void runBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.out.println("run chrome browser");

		} else if (browser.equalsIgnoreCase("edge")) {

			System.out.println("run edge browser");

		} else if (browser.equalsIgnoreCase("firefox")) {

			System.out.println("run firefox browser");

		}
	}

}
