package Oops.Inheritance.MultiLevel;

import java.util.Scanner;

public class TechEmployee extends Employee
{
	String projectName;
	
	public void scanData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id : ");
		id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the name : ");
		name = sc.nextLine();
		
		System.out.println("Enter the salary : ");
		salary = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the dsgn : ");
		dsgn = sc.nextLine();
		
		System.out.println("Enter the project Name : ");
		projectName = sc.nextLine();
	}
	
	public void dispData()
	{
		System.out.println(id + " " + name + " " + salary + " " + dsgn + " " + projectName);
	}
	public static void main(String[] args) 
	{
		TechEmployee techEmp = new TechEmployee();
		
		techEmp.scanData();
		techEmp.dispData();
	}

}
