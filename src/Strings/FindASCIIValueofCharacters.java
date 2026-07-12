package Strings;

import java.util.Scanner;

public class FindASCIIValueofCharacters 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		bruteForce(s);
		better(s);
		optimal(s);
	}

	public static void bruteForce(String s)
	{
		char[] arr = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println((int)arr[i]);
		}
	}
	
	public static void better(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			System.out.println((int)s.charAt(i));
		}
	}

	public static void optimal(String s)
	{
		if(s == null || s.isEmpty())
		{
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++)
		{
			int ascii = s.charAt(i);
			sb.append(ascii).append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
