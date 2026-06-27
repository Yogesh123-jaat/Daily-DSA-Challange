package Conditionals_Loops;

import java.util.Scanner;

public class CGPACalc {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of semesters : ");
		int semester = sc.nextInt();
		
		if(semester <= 0)
		{
			System.out.println("Invalid semester");
		}
		else
		{
			double finalCGPA = calcCGPA(semester);
			
			System.out.println("Aapka Final CGPA hai: " + finalCGPA);
			
			double percentage = finalCGPA * 9.5;
			System.out.println("Aapki Approx Percentage hai: " + percentage + "%");
		}
	}
	
	public static double calcCGPA(int semester)
	{
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		
		for(int i = 1; i <= semester; i++)
		{
			System.out.println("Enter the " + i + " semester CGPA : ");
			double gpa = sc.nextDouble();
			
			if(gpa < 0 || gpa > 10)
			{
				System.out.println("Invalid input");
				i--;
				continue;
			}
			
			sum += gpa;
		}
		
		return sum / semester;
	}

}
