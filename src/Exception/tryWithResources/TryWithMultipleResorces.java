package Exception.tryWithResources;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithMultipleResorces
{
	public static void main(String[] args) 
	{
		try(FileReader fr = new FileReader("input.txt"); FileWriter fw = new FileWriter("output.txt"))
		{
			System.out.println("File is reading and writing");
		}
		catch(IOException e)
		{
			System.out.println("Error message : " + e.getMessage());
		}
	}
}
