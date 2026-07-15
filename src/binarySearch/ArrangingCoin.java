package binarySearch;

import java.util.Scanner;

public class ArrangingCoin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ener the n : ");
		int n = sc.nextInt();
		
		System.out.println(arrangeCoins(n));
	}
	
	public static int mySqrt(long n)
	{
		long start = 1;
		long end = n;
		
		while(start <= end)
		{
			long mid = start + (end - start)/2;
			
			if(mid == n/mid) return (int)mid;
			else if(mid > n/mid) end = mid - 1;
			else start = mid + 1;
		}
		
		return (int)end;
	}
	
	public static int arrangeCoins(int n)
	{
		long m = n;
		return (mySqrt(8*m+1) - 1)/2;
	}
}
