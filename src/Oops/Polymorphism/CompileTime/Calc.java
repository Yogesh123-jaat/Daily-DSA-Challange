package Oops.Polymorphism.CompileTime;

public class Calc 
{
	public void addFun(int num1 , int num2)
	{
		System.out.println("public void addFun(int num1 , int num2) : " + (num1 + num2));
	}
	public void addFun(double num1 , double num2)
	{
		System.out.println("public void addFun(double num1 , double num2) : " + (num1 + num2));
	}
	public void addFun(int num1 , int num2 , int num3)
	{
		System.out.println("public void addFun(int num1 , int num2 , int num3) : " + (num1 + num2 + num3));
	}
	public void addFun(int num1 , int num2 , int num3 , int num4)
	{
		System.out.println("public void addFun(int num1 , int num2 , int num3 , int num4) : " + (num1 + num2 + num3 + num4));
	}

	public static void main(String[] args) 
	{
		Calc c = new Calc();
		
		c.addFun(100, 200);
		c.addFun(100, 200 , 300);
		c.addFun(100, 200 , 300 , 400);
	}

}
/*

	1. Count Match
	2. Data Type Match
	3. Type Promotion rule
	
	boolean ------------- X
	
	
	
					byte
					 |
				   short
				     |
	char ---------> int
				     |
				    long
				     |
				   float
				     |
				   double

*/