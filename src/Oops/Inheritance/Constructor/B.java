package Oops.Inheritance.Constructor;

public class B extends A
{
	B()
	{
		System.out.println("B ---- Default Constructor");
	}
	
	B(int no1)
	{
		super(100);
		System.out.println("B ---- PARA Constructor");
	}
}
