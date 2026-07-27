package recursionByRaghavSir;

public class LookAndSayPattern
{
	public static void main(String[] args) 
	{
		System.out.println(countAndSay(4));
	}
	
	public static String countAndSay(int n)
	{
		if(n == 1) return "1";
		
		String s = countAndSay(n-1);
		String ans = "";
		int i = 0;
		int j = 0;
		
		while(j < s.length())
		{
			if(s.charAt(i) == s.charAt(j)) j++;
			else
			{
				int freq = j - i;
				ans += freq;
				ans += s.charAt(i);
				i = j;
			}
		}
		int freq = j - i;
		ans += freq;
		ans += s.charAt(i);
		
		return ans;
		
	}
}
