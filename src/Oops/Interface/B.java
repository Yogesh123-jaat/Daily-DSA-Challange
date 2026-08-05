package Oops.Interface;

public abstract class B implements A 
{
	@Override
	public void test1() 
	{
		System.out.println("B : test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("B : test2()");
	}
	
	public abstract void test8();
	public abstract void test9();
}
