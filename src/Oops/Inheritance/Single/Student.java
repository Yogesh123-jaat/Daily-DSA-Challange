package Oops.Inheritance.Single;

import java.util.Scanner;

public class Student extends Person
{
	private int rno , std , marks;
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rno : ");
		rno = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the name : ");
		name = sc.nextLine();
		
		System.out.println("Enter the std : ");
		std = sc.nextInt();
		
		System.out.println("Enter the marks : ");
		marks = sc.nextInt();
	}
	
	public void dispData()
	{
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}
}
