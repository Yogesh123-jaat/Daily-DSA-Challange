package Strings;

public class ReverseEachWordInAString 
{
	public static void main(String[] args) 
	{
		String s = " i like this program very much ";
		System.out.println(reverseWords(s));
	}
	
	public static String reverseWords(String s) {
        
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int left = 0;
        
        while(left < n)
        {
            while(left < n && s.charAt(left) == ' ')
            {
                left++;
            }
            
            if(left >= n) break;
            else
            {
                int right = left;
                while(right < n && s.charAt(right) != ' ')
                {
                    right++;
                }
            
              for(int i = right - 1; i >= left; i--)
              {
            	  result.append(s.charAt(i));
              }
              result.append(" ");
              left = right;
            }
        }
        return result.toString().trim();
    }
}
