package recursionByRaghavSir;

public class WaysToReachNthStair 
{
	public static void main(String[] args) 
	{
		int n = 5;
		
		System.out.println(countWays(n));
	}
	
	public static int countWays(int n)
	{
		if(n == 1 || n == 2) return n;
		
		return countWays(n-1) + countWays(n-2);  // T.C. : O(2^n)
	}
}
