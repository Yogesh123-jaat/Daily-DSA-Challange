package Oops.Inheritance.Constructor;

public class C extends B
{
	C()
	{
		System.out.println("C ----- Default Constructor");
	}
	
	C(int no1)
	{
		super(100);
		System.out.println("C ---- PARA Constructor");
	}
}
