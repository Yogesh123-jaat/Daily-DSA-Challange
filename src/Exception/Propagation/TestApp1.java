package Exception.Propagation;

public class TestApp1 
{
	public static void level4()
	{
		System.out.println("Level 4 Start");
		
//		try
//		{
			String name = null;
			System.out.println("Name.length() : " + name.length());
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println("String object is null : " + e.getMessage());
//		}
		System.out.println("Level 4 End");
	}

	public static void level3()
	{
		System.out.println("Level 3 Start");
		level4();
		System.out.println("Level 3 End");
	}
	
	public static void level2()
	{
		System.out.println("Level 2 Start");
		level3();
		System.out.println("Level 2 End");
	}
	
	public static void level1()
	{
		System.out.println("Level 1 Start");
		level2();
		System.out.println("Level 1 End");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main START");
		
		try
		{
			level1();
		}
		catch(NullPointerException e)
		{
			System.out.println("String object is null : " + e.getMessage());
		}
		
		System.out.println("Main END");
	}
}
