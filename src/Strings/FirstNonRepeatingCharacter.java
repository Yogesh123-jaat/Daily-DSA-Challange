package Strings;

public class FirstNonRepeatingCharacter 
{
	public static void main(String[] args)
	{
		String s = "geeksforgeeks";
		
		int n = s.length();
		int[] freq = new int[26];
		
		for(int i = 0; i < n; i++)
		{
			char ch = s.charAt(i);
			int idx = ch - 'a';
			
			freq[idx]++;
		}
		
		for(int i = 0; i < n; i++)
		{
			char ch = s.charAt(i);
			int idx = ch - 'a';
			
			if(freq[idx] == 1)
			{
				System.out.println("Answer is : " + (char)(idx+'a'));
				break;
			}
		}
	}
}
