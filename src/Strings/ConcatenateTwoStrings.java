package Strings;

import java.util.Scanner;

public class ConcatenateTwoStrings {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string1 : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the string2 : ");
		String s2 = sc.nextLine();
		
		System.out.println(bruteForce(s1,s2));
		System.out.println(better(s1,s2));
		System.out.println(optimal(s1,s2));
	}
	
	public static String bruteForce(String s1 , String s2)
	{
		char[] arr = new char[s1.length() + s2.length()];
		
		for(int i = 0; i < s1.length(); i++)
		{
			arr[i] = s1.charAt(i);
		}
		
		for(int i = 0; i < s2.length(); i++)
		{
			arr[s1.length() + i] = s2.charAt(i);
		}
		
		return new String(arr);
	}
	
	public static String better(String s1 , String s2)
	{
		//return s1+s2;
		return s1.concat(s2);
	}
	
	public static String optimal(String s1 , String s2)
	{
		StringBuilder sb = new StringBuilder(s1.length() + s2.length());
		
		sb.append(s1);
		sb.append(s2);
		
		return sb.toString();
	}

}
