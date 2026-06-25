package Conditionals_Loops;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		int rev = 0;
		
		while(num > 0)
		{
			int r = num % 10;
			rev = (rev * 10) + r;
			num /= 10;
		}
		
		System.out.println("Reverse number is : " + rev);  // Time complexity : O(log10(N))
	}

}
