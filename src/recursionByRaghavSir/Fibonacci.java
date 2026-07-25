package recursionByRaghavSir;

public class Fibonacci
{
	public static void main(String[] args) 
	{
		int n = 5;
		
		System.out.println(ans(n));
	}
	
	public static int ans(int n)
	{
		if(n == 1 || n == 0) return n;
		
		return ans(n-1) + ans(n-2);  // T.C. : O(2^n)  A. S : O(n)
	}
}
