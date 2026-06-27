package Conditionals_Loops;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String rev = "";
		
		System.out.println("Enter the string : ");
		String str = sc.next();
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			rev += str.charAt(i);
		}
		
		System.out.println("Reverse string is : " + rev);
	}

}
