package Strings;

public class StringReverse {

	public static void main(String[] args) 
	{
		String s = "Yogesh";
		
		StringBuilder sb = new StringBuilder(s);
		
		sb.reverse();
		
		s = sb.toString();
		
		System.out.println(s);  // q ki string me new object hi banta hai.
	}

}
