package Recursion;

public class CheckStringPalindrome {

	public static void main(String[] args)
	{
		String str = "madam";
		
		System.out.println(fun(0 , str));
	}

	public static boolean fun(int i , String str)
	{
		if(i >= str.length()/2)
		{
			return true;
		}
		if(str.charAt(i) != str.charAt(str.length() - i - 1))
		{
			return false;
		}
		
		return fun(i + 1 , str);
	}
}