package Exception.compileTime;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandledByTryCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader file = new FileReader("test1.txt");
			
			System.out.println("File opened");
		}
		catch(FileNotFoundException e)  // IOException
		{
			System.out.println("File not found : " + e.getMessage());
		}
	}
}
