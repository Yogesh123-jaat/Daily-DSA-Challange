package Exception.OverridingMethod;

import java.io.FileNotFoundException;

public class Child1 extends Parent
{
	@Override
	void readData() throws FileNotFoundException
	{
		System.out.println("Child1 - readData");
	}
}
