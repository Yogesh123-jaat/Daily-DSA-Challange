package Oops.Inheritance.Heirarchical;

public class TestApp1 {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		s1.scanData();
		s1.dispData();
		
		Employee emp = new Employee();
		
		emp.scanData();
		emp.dispData();
	}

}
