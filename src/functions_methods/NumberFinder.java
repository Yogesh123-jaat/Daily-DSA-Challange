package functions_methods;

import java.util.Scanner;

public class NumberFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1 : ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the num2 : ");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter the num3 : ");
		double num3 = sc.nextDouble();
		
		double max = printMaximum(num1 , num2 , num3);
		double min = printMinimum(num1 , num2 , num3);
		
		System.out.println("Maximum number is : " + max);
		System.out.println("Minimum number is : " + min);
	}
	
	static double printMaximum(double num1 , double num2 , double num3)
	{
		double max;
		
		if(num1 >= num2 && num1 >= num3)
		{
			max = num1;
		}
		else if(num2 >= num1 && num2 >= num3)
		{
			max = num2;
		}
		else
		{
			max = num3;
		}
		
		return max;
	}
	
	static double printMinimum(double num1 , double num2 , double num3)
	{
		double min;
		
		if(num1 <= num2 && num1 <= num3)
		{
			min = num1;
		}
		else if(num2 <= num1 && num2 <= num3)
		{
			min = num2;
		}
		else
		{
			min = num3;
		}
		
		return min;
	}

}
