package Strings;

import java.util.Scanner;

public class CountWordsinaSentence 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println(bruteForce(s));
		System.out.println(better(s));
		System.out.println(optimal(s));
	}
	
	public static int bruteForce(String s)
	{
		if(s == null || s.trim().isEmpty())
		{
			return 0;
		}
		
		String[] words = s.split(" ");
		int count = 0;
		
		for(String word : words)
		{
			if(!word.equals(""))
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static int better(String s)
	{
		if(s == null || s.trim().isEmpty())
		{
			return 0;
		}
		
		String[] words = s.trim().split("\\s+");
	
		return words.length;
	}
	
	public static int optimal(String s)
	{
		if(s == null || s.trim().isEmpty())
		{
			return 0;
		}
		
		int count = 0;
		boolean inWord = false;
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(ch == ' ' || ch == '\t' || ch == '\n')
			{
				inWord = false;
			}
			else 
			{
				if(!inWord)
				{
					count++;
					inWord = true;
				}
			}
		}
		
		return count;
	}
}
