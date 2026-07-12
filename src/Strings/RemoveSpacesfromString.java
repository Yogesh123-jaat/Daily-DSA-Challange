package Strings;

import java.util.Scanner;

public class RemoveSpacesfromString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println(bruteForce(s));
		System.out.println(better(s));
		System.out.println(optimal(s));
	}
	
	public static String bruteForce(String s)
	{
		String result = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch != ' ')
			{
				result += ch;
			}
		}
		
		return result;
	}
	
	public static String better(String s)
	{
		return s.replace(" ", "");
	}
	
	public static String optimal(String s)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ' ')
			{
				continue;
			}
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
}
