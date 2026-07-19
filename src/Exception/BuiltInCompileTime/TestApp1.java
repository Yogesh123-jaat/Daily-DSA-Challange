package Exception.BuiltInCompileTime;

import java.io.FileReader;
import java.io.IOException;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("missing");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class not found : " + e.getMessage());
		}
	}
}

class IODemo
{
	public static void main(String[] args) 
	{
		try
		{
			 FileReader file = new FileReader("nonexistent.txt");
		}
		catch(IOException e)
		{
			System.out.println("File error: " + e.getMessage());
		}
	}
}