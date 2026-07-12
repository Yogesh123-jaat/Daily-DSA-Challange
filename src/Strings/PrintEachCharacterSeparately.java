package Strings;

import java.util.Scanner;

public class PrintEachCharacterSeparately {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		bruteForce(s);
		better(s);
	}

	public static void bruteForce(String s)
	{
		char[] arr = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void better(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
	}
}
