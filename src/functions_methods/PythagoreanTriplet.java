package functions_methods;

import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter tthird number : ");
		int c = sc.nextInt();
		
		if(isPythagoreanTriple(a,b,c))
		{
			System.out.println("Yes, it is a Pythagorean Triplet!");
		}
		else
		{
			System.out.println("No, it is not a Pythagorean Triplet.");
		}
	}
	
	static boolean isPythagoreanTriple(int a , int b , int c)
	{
		long sqA = (long) a * a;
		long sqB = (long) b * b;
		long sqC = (long) c * c;
		
		if(sqA == sqB + sqC)
		{
			return true;
		}
		else if(sqB == sqA + sqC)
		{
			return true;
		}
		else if(sqC == sqA + sqB)
		{
			return true;
		}
		
		return false;
	}

}
