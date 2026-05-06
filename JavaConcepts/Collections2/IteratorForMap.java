package Collections2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorForMap {

	
	
	// list, set , map
	
	
	
	public static void main(String[] args) {
	
	

//Map<String,Integer> map= Map.of("age3",19,"age4",21," age5",25);

Map<String,Integer> map= new HashMap<String, Integer>();
map.put("computer", 21);
map.put("mouse", 22);
map.put("cpu", 24);
map.put("chair", 25);

System.out.println(map);

for(Map.Entry<String, Integer>map1:map.entrySet()) {
	
	System.out.println(map1.getKey() + ":"+ map1.getValue());
	
}

//Iterator<Entry<String,Integer>>ii=map.entrySet().iterator();



//while(ii.hasNext()) {
	
//	System.out.println(ii.next());
	
	
}



	}


