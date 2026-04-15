package Programs;

public class Palindrome {

	public static void main(String[] args) {
	String na= new String("abhishek");
	String na1= new String("abhishek");
	if(na.equals(na1)) {
	System.out.println("object equal");
	}
	else {
		System.out.println("object not equal");
		
	}
		String name="Hello Dad";
		String name1="Hello Dad";
		String rev="";
		for(int i=name.length()-1; i>=0;i--) {
			rev= rev+name.charAt(i);
			
			
		}
		System.out.println(rev);
		
		
		if(name==(name1)) {
			
			System.out.println("== both are equal");
			
			
		}else {
			System.out.println("== not equal");
		}
if("Hello dad".equals("Hello dad")) {
			
			System.out.println(". equals both are equal");
			
			
		}else {
			System.out.println(".equals not equal");
		}

	}

}
