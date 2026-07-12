package Strings;

import java.util.Scanner;

public class RemoveSpecificCharacterfromString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println("Enter the character that you want to remove : ");
		char rChar = sc.next().trim().charAt(0);
		
		System.out.println(bruteForce(s , rChar));
		System.out.println(better(s , rChar));
		System.out.println(optimal(s , rChar));
	}
	
	public static String bruteForce(String s , char rChar)
	{
		String result = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch != rChar)
			{
				result += ch;
			}
		}
		
		return result;
	}
	
	public static String better(String s , char rChar)
	{
		return s.replace(String.valueOf(rChar) , "");
	}
	
	public static String optimal(String s , char rChar)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == rChar)
			{
				continue;
			}
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
}
