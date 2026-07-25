package recursionByRaghavSir;

import java.util.Scanner;

public class PowerLinear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the b : ");
		int b = sc.nextInt();
		
		System.out.println(power(a,b));
	}
	
	public static int power(int a , int b)
	{
		if(b == 0) return 1;
		int call = power(a,b/2);
		
		if(b % 2 == 0) return call * call;
		else return a * call * call;    // T.C : O(logb)
	}
	
//	public static int power(int a , int b)
//	{
//		if(b == 0) return 1;
//		
//		return a * power(a,b-1);
//	} T.C. : O(b)
}
