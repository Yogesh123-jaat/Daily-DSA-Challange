package Oops.Encapsulation;

public class Student 
{
	private String name;
	private int rollNumber;
	private double marks;
	
	Student(String name , int rollNumber , double marks)
	{
		setName(name);
		setRollNumber(rollNumber);
		setMarks(marks);
	}
	
	public void setName(String name)
	{
		if(name != null && !name.trim().isEmpty())
		{
			this.name = name;
		}
		else
		{
			System.out.println("Please enter the name");
		}
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setRollNumber(int rollNumber)
	{
		if(rollNumber > 0)
		{
			this.rollNumber = rollNumber;
		}
		else
		{
			System.out.println("Invalid roll number!");
		}
	}
	
	public int getRollNumber()
	{
		return rollNumber;
	}
	
	public void setMarks(double marks)
	{
		if(marks >= 0 && marks <= 100)
		{
			this.marks = marks;
		}
		else
		{
			System.out.println("Invalid marks! Must be between 0-100");
		}
	}
	
	public double getMarks()
	{
		return marks;
	}
	
	public void displayInfo()
	{
		System.out.println(getName() + " " + " " + getRollNumber() + " " + getMarks());
	}
	
	public void isPassed()
	{
		if(getMarks() < 40)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
	}
	
	public void giveGrade()
	{
		if(getMarks() >= 90)
		{
			System.out.println("A+");
		}
		else if(getMarks() >= 70)
		{
			System.out.println("A");
		}
		else if(getMarks() >= 50)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	public static void main(String[] args) 
	{
		Student s1 = new Student("Yogesh" , 11 , 50.5);
		Student s2 = new Student("Aman", 23, 85.0);
	    Student s3 = new Student("Om", 28, 150);
		
       s1.displayInfo();
       s1.isPassed();
       s1.giveGrade();
       
       s2.displayInfo();
       s2.isPassed();
       s2.giveGrade();
       
       s3.displayInfo();
       s3.isPassed();
       s3.giveGrade();
	}
}
