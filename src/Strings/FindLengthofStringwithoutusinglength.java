package Strings;

import java.util.Scanner;

public class FindLengthofStringwithoutusinglength 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		
		System.out.println("Length is : " + findLength(s));
		
	}
	
	public static int findLength(String s)
	{
		int len = 0;
		char[] arr = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++)
		{
			len++;
		}
		return len;
	}
}
