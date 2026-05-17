package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHnadlingConcept {

	static int a= 10;
	
	static int b=0;
	
	
	public static void main(String[] args)  {
		
		
		System.out.println("hello welcome to programming");
		try {
			 int d=a/b;
		}
		catch(ArithmeticException e) {
			
			
			System.out.println("handled the exception");
		
		}
		
		
		
		System.out.println("my program ends");
		
		
		

	}

}
