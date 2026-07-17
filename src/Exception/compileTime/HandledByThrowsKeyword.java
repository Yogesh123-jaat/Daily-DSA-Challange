package Exception.compileTime;

import java.io.FileReader;
import java.io.IOException;

public class HandledByThrowsKeyword
{
	public static void main(String[] args) throws IOException  // FileNotFoundException
	{
		FileReader file = new FileReader("test1.txt");
		
		System.out.println("File Opened");
	}
}