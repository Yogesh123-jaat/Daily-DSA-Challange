package functions_methods;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks : ");
		double mark = sc.nextDouble();
		
		grade(mark);
	}
	
	static void grade(double mark)
	{
		if(mark > 100 || mark < 0)
		{
			System.out.println("Please enter valid marks");
			return;
		}
		
		
		if(mark > 90)
		{
			System.out.println("AA");
		}
		else if(mark > 80)
		{
			System.out.println("AB");
		}
		else if(mark > 70)
		{
			System.out.println("BB");
		}
		else if(mark > 60)
		{
			System.out.println("BC");
		}
		else if(mark > 50)
		{
			System.out.println("CD");
		}
		else if(mark > 40)
		{
			System.out.println("DD");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
