package Strings;

public class PassingStringToMethod 
{
	public static void change(String str)
	{
		str = "Utkarsh";
	}
	public static void main(String[] args)
	{
		String str = "Yogesh";
		System.out.println(str);
		change(str);
		System.out.println(str);
	}

}
