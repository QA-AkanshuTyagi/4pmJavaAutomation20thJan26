package Collections2;

public class IteratorConceptForArray {

	public static void main(String[] args) {


		String[] names= {"rahul", "rohit", "vishal","muwahid","sourav"};
		
		int[]ages= {18,20,25,30,35};
		
		
	/*	for(int i=0;i<=names.length-1;i++) {
			
			System.out.println(names[i]);
			
			
			
			
			
		}
		
		*/
		
		
		for(String name:names) {
			
			
			System.out.println(name);
			
		}
for(int age:ages) {
			
			
			System.out.println(age);
			
		}
	}

}
