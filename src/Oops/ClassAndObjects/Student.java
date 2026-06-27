package Oops.ClassAndObjects;

import java.util.Scanner;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	public void scan()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rno : ");
		rno = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name : ");
		name = sc.nextLine();
		
		System.out.println("Enter std : ");
		std = sc.nextInt();
		
		System.out.println("Enter marks : ");
		marks = sc.nextInt();
	}
	
	public void print()
	{
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}
}
