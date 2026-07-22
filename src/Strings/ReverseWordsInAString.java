package Strings;

public class ReverseWordsInAString 
{
	public static void main(String[] args) 
	{
		StringBuilder result = new StringBuilder();
		
		String s = "  a good   example  ";
		
		int right = s.length() - 1;
		
		while(right >= 0)
		{
			while(right >= 0 && s.charAt(right) == ' ')
			{
				right--;
			}
			
			if(right < 0) break;
			else 
			{
				int left = right;
				
				while(left >= 0 && s.charAt(left) != ' ')
				{
					left--;
				}
				
				result.append(s.substring(left + 1 , right+1));
				result.append(" ");
				right = left;
			}
		}
		
		System.out.println("Answer is : " + result.toString().trim());
	}
}
