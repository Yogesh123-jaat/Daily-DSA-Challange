package Strings;

public class Palindrome {

	public static void main(String[] args)
	{
		String str = "racecar";
		
		int i = 0;
		int j = str.length() - 1;
		boolean flag = true;
		while(i < j)
		{
			if(str.charAt(i) != str.charAt(j)) flag = false;
			i++;
			j--;
		}
		
		if(flag == true)
		{
			System.out.println(str + " is palindrome");
		}
		else
		{
			System.out.println(str + " is not palindrome");
		}
	}

}
