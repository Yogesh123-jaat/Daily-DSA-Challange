package Strings;

public class StringCompression 
{
	public static void main(String[] args) 
	{
		String s = "   aaabbzztkkaa";
		
		System.out.println(compress(s));
	}
	
	public static String compress(String s)
	{
		int n = s.length();
		int left = 0;
		StringBuilder result = new StringBuilder();
		
		while(left < n)
		{
				int right = left;
				while(right < n && s.charAt(right) == s.charAt(left))
				{
					right++;
				}
				
				result.append(s.charAt(left));
				result.append(right-left);
				left = right;
		}
		
		return result.toString();
	}
}
