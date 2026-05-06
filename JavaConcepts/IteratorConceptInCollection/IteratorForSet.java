package IteratorConceptInCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorForSet {

	
	
	// list, set , map
	
	
	
	public static void main(String[] args) {
	
		
		Set<Object> set= new HashSet<Object>(Arrays.asList("RAJKUMAR", "ROHIT",true,19,'a',"ROHIT"));
		
System.out.println(set);

Iterator<Object>obj=set.iterator();

while(obj.hasNext()) {
	
	System.out.println(obj.next());
	
}

	}

}
