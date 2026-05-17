package ExceptionHandling;

public class throwVSThrows {

	public static void main(String[] args)throws Exception {
	
		
		int a=10;
		int b=0;
		String browser="opera";
		
		if(browser.equalsIgnoreCase("chrome")){
			
			
			
			System.out.println("open brpwser chrome");
			
	
	
	
	
	
		}
		else if(browser.equalsIgnoreCase("edge")) {
			
			System.out.println("open edge");
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			
			
			System.out.println("open firefox");

		}
		
		else {
			
			
			throw new Exception("enter correct browser name");
		}
	}

}
