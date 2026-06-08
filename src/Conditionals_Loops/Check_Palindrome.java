package Conditionals_Loops;

import java.util.Scanner;

public class Check_Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num,r,rev=0,dup;
		
		System.out.println("Enter the num : ");
		num = sc.nextInt();
		
		dup = num;
		
		for(;num > 0;)
		{
			r = num % 10;
			rev = (rev * 10) + r;
			num /= 10;
		}
		 
		num = dup;
		
		if(num == rev)
		{
			System.out.println(num + " is palindrome...");
		}
		else
		{
			System.out.println(num + " is not palindrome...");
		}

	}

}
