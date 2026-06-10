package functions_methods;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		
		factorial(num);
	}
	
	static void factorial(int num)
	{
		long fact = 1;
		
		if(num < 0)
		{
			System.out.println("Factorial is not defined for negative numbers.");
			return;
		}
		
		for(int i = 1; i <= num; i++)
		{
			fact *= i;
		}
		
		System.out.println("Factorial is : " + fact);
	}

}
