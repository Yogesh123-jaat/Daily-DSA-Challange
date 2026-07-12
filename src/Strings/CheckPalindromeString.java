package Strings;

import java.util.Scanner;

public class CheckPalindromeString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println("Palindrome String (Brute Force) : " + bruteForce(s));
		System.out.println("Palindrome String (Better Approach) : " + betterApproach(s));
		System.out.println("Palindrome String (Optimal Approach): " + optimal(s));
	}
	
	public static boolean bruteForce(String s)
	{
		String reversed = "";
		
		for(int i = s.length() - 1; i >= 0; i--)
		{
			reversed += s.charAt(i);
		}
		
		return s.equals(reversed);
	}
	
	public static boolean betterApproach(String s)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i = s.length() - 1; i >= 0; i--)
		{
			sb.append(s.charAt(i));
		}
		
		return s.equals(sb.toString());
	}
	
	public static boolean optimal(String s)
	{
		int i = 0;
		int j = s.length() - 1;
		
		while(i < j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

}
