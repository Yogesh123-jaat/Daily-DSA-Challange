package Exception.MultiCatchBlock;

public class TestApp1 
{
	public static void validateInput(String input)
	{
		try
		{
			System.out.println("Input length is : " + input.length());
			
			int num = Integer.parseInt(input);
			
			System.out.println("Num is : " + num);
		}
		catch(NullPointerException | NumberFormatException e)
		{
			System.out.println("Common handler: " + e.getClass().getSimpleName() + " - " + e.getMessage());
			logError(e);
		}
	}
	public static void main(String[] args) 
	{
		validateInput(null);
		
		validateInput("abc");
	}
}
