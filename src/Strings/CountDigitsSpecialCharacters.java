package Strings;

import java.util.Scanner;

public class CountDigitsSpecialCharacters 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		bruteForce(s);
		betterApproach(s);
		optimalApproach(s);
	}
	
	public static void bruteForce(String s)
	{
		int digitCount = 0;
		int specialChar = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch >= '0' && ch <= '9')
			{
				digitCount++;
			}
			else if(!(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z') && ch != ' ')
			{
				specialChar++;
			}
		}
		
		System.out.println("Digit Count is : " + digitCount);
		System.out.println("Special Character count is : " + specialChar);
	}
	
	public static void betterApproach(String s)
	{
		int digitCount = 0;
		int specialChar = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				digitCount++;
			}
			else if(!Character.isLetter(ch) && !Character.isWhitespace(ch))
			{
				specialChar++;
			}
		}
		
		System.out.println("Digit Count is : " + digitCount);
		System.out.println("Special Character count is : " + specialChar);
	}
	
	public static void optimalApproach(String s)
	{
		int digitCount = 0;
		int specialChar = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch == ' ')
			{
				continue;
			}
			else if(ch >= '0' && ch <= '9')
			{
				digitCount++;
			}
			else
			{
				specialChar++;
			}
		}
		
		System.out.println("Digit Count is : " + digitCount);
		System.out.println("Special Character count is : " + specialChar);
	}
}
