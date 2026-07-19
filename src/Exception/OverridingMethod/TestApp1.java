package Exception.OverridingMethod;

import java.io.IOException;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Parent p1 = new Child1();
		Parent p2 = new Child2();
		Parent p3 = new Child3();
		
		try
		{
			p1.readData();
			p3.readData();
			p2.readData();
		}
		catch(IOException e)
		{
			System.out.println("Message : " + e.getMessage());
		}
		
	}
}
