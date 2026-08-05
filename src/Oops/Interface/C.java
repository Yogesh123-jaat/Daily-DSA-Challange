package Oops.Interface;

public class C extends B 
{
	@Override
	public void test3() 
	{
		System.out.println("C : test3()");	
	}
	@Override
	public void test4() 
	{
		System.out.println("C : test4()");
	} 
	@Override
	public void test8() 
	{
		System.out.println("C : test8()");	
	}
	@Override
	public void test9() 
	{
		System.out.println("C : test9()");	
	}
	
	public static void main(String[] args) 
	{
		A obj = new C();
		
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		A.test5();
		obj.test6();
		
		if(obj instanceof C)
		{
			C objC = (C)obj;
			objC.test8();
			objC.test9();
		}
	}
}
