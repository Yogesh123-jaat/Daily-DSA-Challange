package Exception.OverridingMethod;

import java.io.IOException;

public class Parent 
{
	void readData() throws IOException
	{
		System.out.println("Parent read");
	}
}
