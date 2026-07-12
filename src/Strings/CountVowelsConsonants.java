package Strings;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		bruteForce(s);
		optimal(s);
	}
	
	public static void optimal(String s)
	{
		int vowelCount = 0;
		int consonentCount = 0;
		
		String vowels = "aeiouAEIOU";
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			{
				if(vowels.indexOf(ch) != -1)
				{
					vowelCount++;
				}
				else
				{
					consonentCount++;
				}
			}
		}
		
		System.out.println("Vowel count is : " + vowelCount);
		System.out.println("Consonent Count is : " + consonentCount);
	}
	
	public static void bruteForce(String s)
	{
		s = s.toLowerCase();
		
		int vowelCount = 0;
		int consonentCount = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowelCount++;
			}
			else if(ch >= 'a' && ch <= 'z')
			{
				consonentCount++;
			}
		}
		
		System.out.println("Vowel count is : " + vowelCount);
		System.out.println("Consonent Count is : " + consonentCount);
	}

}
