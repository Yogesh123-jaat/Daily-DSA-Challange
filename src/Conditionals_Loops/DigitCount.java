package Conditionals_Loops;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int count = (int) (Math.log10(num) + 1);  // Optimal approach Time complexity : O(1)
		
//		int count = 0;
//		
//		while(num > 0)
//		{
//			count++;
//			num /= 10;
//		}     Brute force approach Time complexity : log10(N) + 1
		
		System.out.println("Digit count is : " + count);
	}

}
