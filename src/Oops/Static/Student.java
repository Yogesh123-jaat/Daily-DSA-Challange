package Oops.Static;

public class Student 
{
	String name;
	int rollNumber;
	
	static String collegeName;
	static int totalStudents;
	
	static
	{
        collegeName = "VGEC";
        totalStudents = 0;
        System.out.println("Static block executed - runs only once");
    }
	
	Student(String name , int rollNumber)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		totalStudents++;
	}
	
	Student(Student s)
	{
		this(s.name, s.rollNumber);
	}
	
	void displayInfo()
	{
		System.out.println(name + " - " + rollNumber + " - " + collegeName);
	}

	static void showCollegeName()
	{
		System.out.println("Collge name : " + collegeName);
	}
	
	static void showTotalStudents()
	{
		System.out.println("Total students : " + totalStudents);
	}
	
	public static void main(String[] args) 
	{
		Student s1 = new Student("Yogesh", 11);
        Student s2 = new Student("Aman", 23);
        Student s3 = new Student("Om", 28);
        Student s4 = new Student(s3);
        Student s5 = s4;
        
        s4.name = "Changed";
        
        s4.displayInfo();
        s3.displayInfo();
        s5.displayInfo();

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
        s5.displayInfo();
        
        Student.showTotalStudents();
        Student.showCollegeName();
	}
}
