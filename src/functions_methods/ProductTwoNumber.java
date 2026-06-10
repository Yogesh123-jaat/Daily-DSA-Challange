package functions_methods;

import java.util.Scanner;

public class ProductTwoNumber {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the num1 : ");
			double num1 = sc.nextDouble();
			
			System.out.println("Enter the num2 : ");
			double num2 = sc.nextDouble();
			
			product(num1 , num2);
	}
	
	static void product(double num1 , double num2)
	{
		System.out.println("The Product of two number is : " + (num1*num2));
	}

}
