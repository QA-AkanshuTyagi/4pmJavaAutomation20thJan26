package MutableAndNonMutable;

public class StringBuilderAndBufferConcept {

	public static void main(String[] args) {

		String name="vishal";
	String fullname=	name +("singh");
		
		System.out.println(fullname);

		
		//
		
		StringBuilder sb= new StringBuilder("ramsharma");
		StringBuilder sb1= new StringBuilder("ramsharma");
		sb.append("abkas");
		//System.out.println(sb.compareTo(sb1));
	/*	System.out.println(sb.delete(1,3));
		System.out.println(sb.insert(1, "am"));
		sb1.append("sharma");
System.out.println(sb1.capacity());
		sb.append("singh");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		sb.append('a');//char
		
		System.out.println(sb);//charsequence
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(10));*/
		
System.out.println(	sb.isEmpty());

System.out.println(sb.replace(3, 9, "is"));
		
	}

}
