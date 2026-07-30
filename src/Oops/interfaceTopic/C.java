package Oops.interfaceTopic;

public class C extends B
{
	@Override
	public void test3() 
	{
		System.out.println("C : test3()");
	}
	@Override
	public void test7() 
	{
		System.out.println("C : test7()");
	}
	@Override
	public void test8() 
	{
		System.out.println("C : test8()");
	}
	
	public static void main(String[] args) 
	{
		A obj = new C();
		
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test5();
		
		A.test4();
		
		if(obj instanceof C)
		{
			C objC = (C)obj;
			objC.test7();
			objC.test8();
		}
	}
}
