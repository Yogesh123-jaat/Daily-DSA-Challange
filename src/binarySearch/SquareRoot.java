package binarySearch;

import java.util.Scanner;

public class SquareRoot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n : ");
		int n = sc.nextInt();
		
		System.out.println(bruteForce(n));
		System.out.println(optimal(n));
	}
	
	public static int bruteForce(int n)
	{
		int root = 1;
		for(int i = 1; i <= n; i++)
		{
			if(i * i > n) break;
			root = i;
		}
		return root;
	}
	
	public static int optimal(int n)
	{
		int start = 1;
		int end = n;
		
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			
			if(mid == n/mid) return mid;
			else if(mid > n/mid) end = mid - 1;
			else start = mid + 1;
		}
		
		return end;
	}
}
