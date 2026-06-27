package Conditionals_Loops;

import java.util.Scanner;

public class FindHCFLCM {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the num2 : ");
		int num2 = sc.nextInt();
		
		int hcf = findHCF(num1 , num2);
		int lcm = findLCM(num1 , num2);
		
		System.out.println("HCF of two number is : " + hcf);
		System.out.println("HCF of two number is : " + lcm);
	}
	
	public static int findHCF(int num1 , int num2)
	{
		int min , hcf = 1;
		
		if(num1 < num2)
		{
			min = num1;
		}
		else
		{
			min = num2;
		}
		
		for(int i = min; i >= 1; i--)
		{
			if(num1 % i == 0 && num2 % i == 0)
			{
				hcf = i;
				break;
			}
		}
		
		return hcf;
	}
	
	public static int findLCM(int num1 , int num2)
	{
		int hcf = findHCF(num1 , num2);
		
		int lcm = (num1 * num2) / hcf;
		
		return lcm;
	}

}
