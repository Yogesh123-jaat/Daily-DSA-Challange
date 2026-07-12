package Strings;

import java.util.Scanner;

public class ToggleEachCharacterCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println(bruteForceToggle(s));
		System.out.println(toggleBetter(s));
	}
	
	public static String bruteForceToggle(String s)
	{
		char[] arr = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] >= 'a' && arr[i] <= 'z')
			{
				arr[i] = (char)(arr[i] - 32);
			}
			else if(arr[i] >= 'A' && arr[i] <= 'Z')
			{
				arr[i] = (char)(arr[i] + 32);
			}
		}
		
		return new String(arr);
	}
	
	public static String toggleBetter(String s) 
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch))
			{
				sb.append(Character.toUpperCase(ch));
			}
			else if(Character.isUpperCase(ch))
			{
				sb.append(Character.toLowerCase(ch));
			}
			else
			{
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}
}
