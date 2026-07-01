package Oops.Constructor;

public class Students 
{
	String name;
	int rollNumber;
	double marks;
	
	Students()
	{
		this("Not Assigned" , 0 , 0.0);
		System.out.println("New student record created");
	}
	
	Students(String name , int rollNumber , double marks)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
		System.out.println("Student " + this.name + " added successfully"); // Here this optional same hi o/p rahega.
	}
	
	void displayInfo()
	{
		System.out.println("Name: " + this.name + ", Roll No: " + this.rollNumber + ", Marks: " + this.marks); // Here this optional same hi o/p rahega.
	}
	
	void isPassed()
	{
		if(marks >= 40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	void giveGrade()
	{
		if(marks >= 90)
		{
			System.out.println("A+");
		}
		else if(marks >= 75)
		{
			System.out.println("A");
		}
		else if(marks >= 60)
		{
			System.out.println("B");
		}
		else if(marks >= 40)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) 
	{
		Students s1 = new Students();
		
		s1.displayInfo();
		s1.isPassed();
		s1.giveGrade();
		
		Students s2 = new Students("Aman" , 23 , 70.25);
		
		s2.displayInfo();
		s2.isPassed();
		s2.giveGrade();
		
		Students s3 = new Students("Om" , 28 , 50.25);
		
		s3.displayInfo();
		s3.isPassed();
		s3.giveGrade();
		
	}

}