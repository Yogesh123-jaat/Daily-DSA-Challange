package Exception.ThrowsKeyword;

import java.io.IOException;

public class PracticeProgram 
{
	public static void methodC() throws IOException
	{
//		try
//		{
			throw new IOException("Something IO Problem occuring");
//		}
//		catch(IOException e)
//		{
//			System.out.println("Exception caught : " + e.getMessage());
//		}
	}
	public static void methodB() throws IOException
	{
		methodC();
	}
	public static void methodA() throws IOException
	{
		methodB();
	}
	public static void main(String[] args) 
	{
		try
		{
			methodA();
		}
		catch(IOException e)
		{
			System.out.println("Exception caught : " + e.getMessage());
		}
	}
}
