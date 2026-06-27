package Conditionals_Loops;

import java.util.Scanner;

public class DistanceBtwTwoPoints {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the coordinates for point 1 (x1 , y1) : ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.println("Enter the coordinates for point 2 (x2 , y2) : ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double distance = calcDistance(x1 , y1 , x2 , y2);
		
		System.out.println("The distance between the two points is : " + distance);
		
	}
	
	public static double calcDistance(double x1 , double y1 , double x2 , double y2)
	{
		double xDiff = x2 - x1;
		double yDiff = y2 - y1;
		
		double distance = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
		
		return distance;
	}

}
