package Exception.OverridingMethod;

import java.io.IOException;

public class Child2 extends Parent
{
	void readData() throws IOException
	{
		System.out.println("Child2 - readData");
	}
}
