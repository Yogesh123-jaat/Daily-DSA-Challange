package functions_methods;

import java.util.Scanner;

public class EligibleForVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		canVote(age);
	}
	
	static void canVote(int age)
	{
		if(age >= 18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not Eligible for vote");
		}
	}

}
