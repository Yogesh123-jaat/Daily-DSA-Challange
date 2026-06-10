package functions_methods;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		palindrome(num);
	}
	
	static void palindrome(int num)
	{
		if(num < 0)
		{
			System.out.println(num + " is not palindrome");
			return;
		}
		
		int dup = num;
		int r , rev=0;
		while(dup != 0)
		{
			r = dup % 10;
			rev = (rev * 10) + r;
			dup /= 10;
		}
		
		
		if(num == rev)
		{
			System.out.println(num + " is palindrome");
		}
		else
		{
			System.out.println(num  + " is not palindrome");
		}
	}

}
