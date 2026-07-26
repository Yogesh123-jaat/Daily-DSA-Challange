package recursionByRaghavSir;

public class UniquePaths
{
	public static void main(String[] args) 
	{
		int m = 5;
		int n = 8;
		
		System.out.println(uniquePaths(m,n));
	}
	
	public static int uniquePaths(int m , int n)
	{
		if(m == 1 || n == 1) return 1;
		
		return uniquePaths(m-1,n) + uniquePaths(m,n-1);
	}
}
