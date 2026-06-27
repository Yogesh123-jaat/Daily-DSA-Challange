package Conditionals_Loops;

import java.util.Scanner;

public class CategorizSum {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sumNegative = 0;
		int sumPositiveEven = 0;
		int sumPositiveOdd = 0;
		
		System.out.println("Enter the number : (For stop the program enter the 0) : ");
		
		while(true)
		{
			int num = sc.nextInt();
			
			if(num == 0)
			{
				break;
			}
			if(num < 0)
			{
				sumNegative += num;
			}
			else if(num % 2 == 0)
			{
				sumPositiveEven += num;
			}
			else
			{
				sumPositiveOdd += num;
			}
		}
		
		System.out.println("\n--- Final Calculations ---");
		System.out.println("Sum of Negative Numbers      : " + sumNegative);
		System.out.println("Sum of Positive Even Numbers : " + sumPositiveEven);
		System.out.println("Sum of Positive Odd Numbers  : " + sumPositiveOdd);
	}

}
