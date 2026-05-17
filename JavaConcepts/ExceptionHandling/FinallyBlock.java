package ExceptionHandling;

public final class FinallyBlock {

	final int new1= 10;
	
	
	public  static void main(String[] args) {


		
		
		
		int a= 10;
		int b=0;
		
	
		try {
		System.out.println(a/b);
		
		}
		
		catch(ArithmeticException e) {
			
			throw new ArithmeticException ("value of b cannot be zero");
			
			
			
		}
		finally {
		System.out.println("hello  guys");
		
		System.out.println("ye chelega hi chelega");
		
		}
	}

}
