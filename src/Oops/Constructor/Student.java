package Oops.Constructor;

public class Student 
{
	int rno;
	String name;
	int std;
	int marks;
	
	Student()
	{
		System.out.println("=========== START :: Default Constructor ===========");
		
		System.out.println(rno + " " + name + " " + std + " " + marks);
		
		rno = 1;
		name = "Yogesh";
		std = 12;
		marks = 100;
		
		System.out.println(rno + " " + name + " " + std + " " + marks);
		
		System.out.println("=========== EXIT :: Default Constructor ===========");
	}
	
	Student(int rno , String name , int std , int marks)
	{
		this(rno , name , std);
		System.out.println("=========== START :: PARA(Four) Constructor ============");
		System.out.println(rno + " " + name + " " + std + " " + marks);
		
		
//		this.rno = rno;
//		this.name = name;
//		this.std = std;
		this.marks = marks;
		
		System.out.println(rno + " " + name + " " + std + " " + marks);
		
		System.out.println("=========== EXIT :: PARA(Four) Constructor ==============");
	}
	
	Student(int rno , String name , int std)
	{
		this(rno , name);
		
		System.out.println("=========== START :: PARA(Three) Constructor ============");
		System.out.println(rno + " " + name + " " + std + " " + marks);
		
//		this.rno = rno;
//		this.name = name;
		this.std = std;
		
		System.out.println(rno + " " + name + " " + std + " " + marks);
		
		System.out.println("=========== EXIT :: PARA(Three) Constructor ==============");
	}
	
	Student(int rno , String name)
	{
		this();
		
		System.out.println("=========== START :: PARA(TWO) Constructor ============");
		System.out.println(rno + " " + name + " " + std + " " + marks);
		
		this.rno = rno;
		this.name = name;
		
		System.out.println(rno + " " + name + " " + std + " " + marks);
		
		System.out.println("=========== EXIT :: PARA(TWO) Constructor ==============");
	}
	
	Student(Student s)
	{
		System.out.println("=========== START :: PARA-COPY Constructor ===============");
		
		System.out.println(rno + " " + name + " " + marks + " " + std);
		
		rno = s.rno;
		name = s.name;
		marks = s.marks;
		std = s.std;
		
		System.out.println(rno + " " + name + " " + marks + " " + std);
		
		System.out.println("=========== EXIT :: PARA-COPY Constructor ===============");
	}
	
	public void dispData()
	{
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("=========== START :: Main Method ===========");
		
		Student s1 = new Student();
		Student s2 = new Student(2 , "Aman" , 12 , 100);
		Student s3 = new Student(3 , "Om" , 12);
		Student s4 = new Student(4 , "Ajay");
		Student s5 = new Student(s2);
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
		s4.dispData();
		s5.dispData();
		
		
		System.out.println("=========== EXIT :: Main Method ===========");
	}
}