package Collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorForList {

	
	
	// list, set , map
	
	
	
	public static void main(String[] args) {
	List<Object> list2= new ArrayList<Object>(Arrays.asList("rahul", 'a', true, 19));
list2.add("akhil");
List<Object> list=new ArrayList<Object>();
list.addAll(list2);
//System.out.println(list2);


//1.
 Iterator<Object>obj=list2.iterator();

while(obj.hasNext()) {
	
	System.out.println(obj.next());
}


//2.  1,2,3,4

ListIterator<Object>obj2=list2.listIterator();

while(obj2.hasNext()) {
	
	
	System.out.println(obj2.next());
	
	
}

while(obj2.hasPrevious()) {
	
	System.out.println(obj2.previous());
}





	}

}
