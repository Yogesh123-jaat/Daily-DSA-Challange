package functions_methods;

import java.util.Scanner;

public class SumTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1 : ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the num2 : ");
		double num2 = sc.nextDouble();
		
		sum(num1 , num2);
	}
	
	static void sum(double num1 , double num2)
	{
		System.out.println("The addition is : " + (num1+num2));
	}

}
