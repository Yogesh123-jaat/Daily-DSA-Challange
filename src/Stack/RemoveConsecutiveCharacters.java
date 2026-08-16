package Stack;

import java.util.Stack;

public class RemoveConsecutiveCharacters 
{
	public static void main(String[] args) 
	{
		String s = "aaaabbbbbcccdddaa";
		
		System.out.println(removeDuplicates(s));
	}
	public static String removeDuplicates(String s) 
    {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            if(st.size() == 0) st.push(ch);
            else
            {
                char top = st.peek();
                if(top != ch) st.push(ch); 
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
        while(!st.isEmpty())
        {
            ans.append(st.pop());
        }
        
        return ans.reverse().toString();
    }
}
