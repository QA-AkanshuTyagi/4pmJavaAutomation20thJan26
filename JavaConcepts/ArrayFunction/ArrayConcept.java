package ArrayFunction;

public class ArrayConcept {

	public static void main(String[] args) {

String[] names= {"akanshu", "rahul", "sourabh","vishal"};
	int[]	values= {10,20, 20000,201};

	String[] name1= new String[5];
	name1[0]="shivam";
	name1[1]="rahul1";
	name1[2]="rahul11";
	name1[3]="rahul133";
	name1[4]="rahul13455";
	
	//for(int i=0;i<=names.length-1;i++) {
	//System.out.println(names[i]);
//	}
	for(String nam:names) {
		System.out.println(nam);
		
	}

}}
