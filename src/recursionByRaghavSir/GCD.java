package recursionByRaghavSir;

public class GCD 
{
	public static void main(String[] args) 
	{
		int a = 29;
		int b = 41;
		
		System.out.println(gcd(a,b));
	}
	
	public static int gcd(int a , int b)
	{
		return helper(Math.min(a, b) , Math.max(a, b));
	}
	
	public static int helper(int a, int b)
	{
		if(a == 0) return b;
		
		return helper(b%a , a);  // T.C. : O(log(min(a,b)))
	}
}
