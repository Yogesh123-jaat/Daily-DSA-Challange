package functions_methods;

import java.util.Scanner;

public class SumOfNNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		sum(num);
	}
	
	static void sum(int n)
	{
		if (n <= 0) 
		{
            System.out.println("Please enter a valid natural number (greater than 0).");
            return;
        }
		long totalSum = ((long) n * (n + 1)) / 2;
		System.out.println("Sum of "+ n +" natural number is : " + totalSum);
	}

}
