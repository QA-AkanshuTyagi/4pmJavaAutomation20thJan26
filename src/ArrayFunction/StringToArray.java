package ArrayFunction;

import java.util.Arrays;

public class StringToArray {

	public static void main(String[] args) {

String sentence="hello guys how are you";
	String[] split=	sentence.split(" ");
		String rev="";
System.out.println(Arrays.toString(split));

for(int i=split.length-1;i>=0;i--) {
	
	rev= rev+ split[i]+" ";
}
System.out.println(rev);
	}

}
