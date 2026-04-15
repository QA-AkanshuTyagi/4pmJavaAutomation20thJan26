package stringFunctions;

public class StringFunctionsConcept {

	/*
	 * length()																									
equals()																									
equalsignorecash()																									
toUpperCase																									
ToLoserCase																									
charAT(Index)																									
indexofchar()																									
lastIndexOf																									
trim																									
replace(char ,char)																									
replace(char seq,char seq)																									
replaceAll(String regix,String)																									
repeat																									
Substring(start index)																									
Substring(start index,end index)																									
contains																									
concat																									
	
	 * 
	 */
	public static void main(String[] args) {
		
		String string = "rahulsharma";
		String string1= "Rahulsharma";
		String name="muwahid is good boy ";
	System.out.println(string.length());
		
		
	boolean value= string.equals(string1);
	boolean value1= string.equalsIgnoreCase(string1);
	System.out.println(string.toUpperCase());
	System.out.println(string1.toLowerCase());
	System.out.println(string.indexOf("a"));
	System.out.println(string1.charAt(5));
	System.out.println(string1.lastIndexOf("h"));
	System.out.println(name.trim());
	System.out.println(name.replace(" ", ""));
	System.out.println(name.substring(10));
	System.out.println(name.substring(11, 15));
	
	System.out.println(string.replaceFirst("r", "hello"));
	System.out.println(string.repeat(4));
	
	System.out.println(name.contains("muwa"));
	
	System.out.println(string.concat(string1));
		System.out.println(value1);
	}
	
	
	
	
}
