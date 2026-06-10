package functions_methods;

import java.util.Scanner;

public class CircleCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle : ");
		double radius = sc.nextDouble();
		
		printArea(radius);
        printCircumference(radius);
	}
	
	static void printArea(double radius)
	{
		double area = Math.PI * radius * radius;
		
		System.out.printf("Area of the circle is : %.2f\n" , area);
	}
	static void printCircumference(double radius)
	{
		double circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference of the Circle: %.2f\n", circumference);
	}

}
