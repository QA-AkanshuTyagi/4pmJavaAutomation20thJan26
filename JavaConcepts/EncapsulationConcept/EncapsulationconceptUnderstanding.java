package EncapsulationConcept;

public class EncapsulationconceptUnderstanding {

	
	
	
	
	public static void main(String[] args) {
		
		
		hidingclass hh= new hidingclass();		
		hh.setSalary("Rahul",10000);

		
	System.out.println(hh.getName()+ ":"+hh.getSalary());
		
		hh.setSalary("vishal", 60000);
		System.out.println(hh.getName()+ ":"+hh.getSalary());

		
	}
	//getter method

}
