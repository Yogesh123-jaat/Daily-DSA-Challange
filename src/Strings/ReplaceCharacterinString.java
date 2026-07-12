package Strings;

import java.util.Scanner;

public class ReplaceCharacterinString {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		System.out.println("Enter the character that you want to change in string : ");
		char oldChar = sc.next().trim().charAt(0);
		
		System.out.println("Enter the character that you want to insert in string : ");
		char newChar = sc.next().trim().charAt(0);
		
		System.out.println(bruteForce(s , oldChar , newChar));
		System.out.println(better(s, oldChar , newChar));
		System.out.println(optimal(s , oldChar , newChar));
	}

	public static String bruteForce(String s , char oldChar , char newChar)
	{
		String result = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == oldChar)
			{
				result += newChar;
			}
			else
			{
				result += s.charAt(i);
			}
		}
		
		return result;
	}
	
	public static String better(String s, char oldChar , char newChar)
	{
		if(s == null)
		{
			return null;
		}
		
		return s.replace(oldChar , newChar);
	}
	
	public static String optimal(String s, char oldChar , char newChar)
	{
		if(s == null)
		{
			return null;
		}
		char[] ch = s.toCharArray();
		boolean flag = false;
		
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == oldChar)
			{
				ch[i] = newChar;
				flag = true;
			}
		}
		
		return flag ? new String(ch) : s;
	}
}
