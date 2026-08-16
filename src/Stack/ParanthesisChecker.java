package Stack;

import java.util.Stack;

public class ParanthesisChecker 
{
	public static void main(String[] args) 
	{
		String s = "((([]{})))";
		
		System.out.println(isBalanced(s));
	}
	public static boolean isMatching(char a , char b)
    {
        if(a == ')' && b == '(') return true;
        if(a == ']' && b == '[') return true;
        if(a == '}' && b == '{') return true;
        
        return false;
    }
    public static boolean isBalanced(String s) 
    {
        int n = s.length();
        
        if(n % 2 == 1) return false;
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '[' || ch == '{')
            {
                st.push(ch);   
            }
            else
            {
                if(st.size() == 0) return false;
                char top = st.peek();
                if(isMatching(ch , top)) st.pop();
                else
                {
                    return false;
                }
            }
        }
        
        return (st.size() == 0);
    }
}
