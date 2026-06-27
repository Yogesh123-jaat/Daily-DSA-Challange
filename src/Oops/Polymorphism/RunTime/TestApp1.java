package Oops.Polymorphism.RunTime;

import java.util.Scanner;

public class TestApp1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1) For school");
		System.out.println("2) For Org");
		System.out.println("3) For public place");
		System.out.println("4) For Home");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 : School school = new School();
				 school.getBehave();
				 break;
				 
		case 2: Org org = new Org();
				org.getBahave();
				break;
				
		case 3: PublicPlace obj = new PublicPlace();
				obj.getBehave();
				break;
				
		case 4: Home home = new Home();
				home.getBehave();
				break;
		}
	}

}
