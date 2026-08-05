package Oops.Interface;

public interface A 
{
	public static final int NO = 100;
	
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	public abstract void test4();
	
	
	
	static void test5()
	{
		System.out.println("A : void test5()");
	}
	
	default void test6()
	{
		test7();
		System.out.println("A : void test6()");
	}
	
	private void test7()
	{
		System.out.println("A : test7()");
	}
}
