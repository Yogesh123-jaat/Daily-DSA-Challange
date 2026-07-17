package Exception.throwKeyword;

public class ThrowWithHandleByTryCatch 
{
	public static void checkAge(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("You can't vote.");
		}
		
		System.out.println("You can Vote");
	}
	public static void main(String[] args) 
	{
		System.out.println("START");
		
		try
		{
			checkAge(18);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Young age : " + e.getMessage());
		}
		
		System.out.println("End");
	}
}
