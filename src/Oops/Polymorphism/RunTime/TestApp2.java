package Oops.Polymorphism.RunTime;

import java.util.Scanner;

public class TestApp2 
{
	public static void getBehaveByPlace(Person person)
	{
		person.getBehave();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For Public Place");
		System.out.println("4) For Home");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		
		
		switch(choice)
		{
		case 1 : School school = new School();
				 getBehaveByPlace(school);
				 break;
				 
		case 2: Org org = new Org();
				getBehaveByPlace(org);
				break;
				
		case 3: PublicPlace obj = new PublicPlace();
				getBehaveByPlace(obj);
				break;
				
		case 4: Home home = new Home();
				getBehaveByPlace(home);
				break;
		}
	}

}
