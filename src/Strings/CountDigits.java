package Strings;

import java.util.Scanner;

public class CountDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no : ");
		int no = sc.nextInt();
		
		String s = "" + no;
		
		System.out.println(s.length());
	}
}
