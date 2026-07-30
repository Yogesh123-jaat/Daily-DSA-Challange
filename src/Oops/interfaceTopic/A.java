package Oops.interfaceTopic;

public interface A
{
	// 1. Constatnt Variables(public static final) 
	public static final int NO = 10;
	
	//2. Methods
	
		// 1. Abstract methods(public abstract)
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	
	// 2. Non Abstract methods (static , default , private)
	
	static void test4()
	{
		System.out.println("A : static void test4()");
	}
	
	default void test5()
	{
		System.out.println("A : static void test5()");
		test6();
	}
	
	private void test6()
	{
		System.out.println("A : static void test6()");
	}
}
