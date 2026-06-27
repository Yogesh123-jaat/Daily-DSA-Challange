package Oops.Inheritance.Heirarchical;

import java.util.Scanner;

public class Employee extends Person
{
	int id , salary;
	String dsgn;
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id : ");
		id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the name : ");
		name = sc.nextLine();
		
		System.out.println("Enter the salary : ");
		salary = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the dsgn : ");
		dsgn = sc.nextLine();
	}
	
	public void dispData()
	{
		System.out.println(id + " " + name + " " + salary + " " + dsgn);
	}
}
