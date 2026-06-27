package Conditionals_Loops;

import java.util.Scanner;

public class LeapYr {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eter the year : ");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not leap year");
		}
	}

}
