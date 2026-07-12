package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		
		System.out.println("Reversed String is (By Brute Force) : " + reverseBruteForce(str));
		System.out.println("Reversed String is (By Better Approach) : " + reverseBetter(str));
		System.out.println("Reversed String is (By Optimal Approach) : " + reverseOptimal(str));
	}
	
	public static String reverseBruteForce(String str)
	{
		String s = "";
		int j = 0;
		for(int i = str.length() - 1; i >= 0; i--)
		{
			s += str.charAt(i);
			j++;
		}
		
		return s;
	}
	
	public static String reverseBetter(String str)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}
	
	public static String reverseOptimal(String str)
	{
		char[] ch = str.toCharArray();
		
		int i = 0;
		int j = ch.length - 1;
		
		while(i < j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}
}
