package Strings;

import java.util.Scanner;

public class ConvertUpperCaseToLowerCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println(bruteForce(s));
		System.out.println(betterApproach(s));
		System.out.println(optimalApproach(s));
	}
	
	public static String bruteForce(String s)
	{
		String result = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
			{
				result += Character.toLowerCase(ch);
			}
			else
			{
				result += ch;
			}
		}
		
		return result;
	}
	
	public static String betterApproach(String s)
	{
		return s.toLowerCase();
	}
	
	public static String optimalApproach(String s)
	{
		char[] arr = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++)
		{	
			if(arr[i] >= 'A' && arr[i] <= 'Z')
			{
				arr[i] = (char)(arr[i] + 32);
			}
		}
		
		return new String(arr);
	}

}
