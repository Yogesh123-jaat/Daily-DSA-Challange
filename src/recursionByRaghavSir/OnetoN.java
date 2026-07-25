package recursionByRaghavSir;

import java.util.Scanner;

public class OnetoN 
{
	//static int n;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n : ");
		int n = sc.nextInt();
		
		print(n);
	}
	
	public static void print(int n)
	{
		if(n == 0) return;
		
		print(n-1);
		System.out.println(n);
	}
	
//	public static void print(int x)
//	{
//		if (x > n) return;
//		System.out.println(x);
//		
//		print(x+1);
//	}
	
//	public static void print(int x , int n)
//	{
//		if (x > n) return;
//		System.out.println(x);
//		
//		print(x+1 , n);
//	}
}
