package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Stack<Character> st = new Stack<>();
		
		System.out.println("Enter the expression : ");
		String s =  sc.nextLine();
		
		boolean balanced = true;
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch == '(' || ch == '[' || ch == '{')
			{
				st.push(ch);
			}
			else if(ch == ')' || ch == ']' || ch == '}')
			{
				if(st.isEmpty())
				{
					balanced = false;
					break;
				}
				
				char topElement = st.pop();
				
				if(!isMatching(topElement , ch))
				{
					balanced = false;
					break;
				}
			}
			
		}
		if(balanced == true && st.isEmpty())
		{
			System.out.println("Balanced...");
		}
		else
		{
			System.out.println("Unbalanced...");
		}
	}
	
	public static boolean isMatching(char open , char close)
	{
		if(open == '(' && close == ')') return true;
		if(open == '[' && close == ']') return true;
		if(open == '{' && close == '}') return true;
		
		return false;
	}
}
