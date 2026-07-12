package Strings;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string1 : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the string2 : ");
		String s2 = sc.nextLine();
		
		System.out.println(bruteForce(s1,s2));
		System.out.println(better(s1,s2));
	}

	public static boolean bruteForce(String s1 , String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean better(String s1 , String s2)
	{
		return s1.equals(s2);
	}
}
