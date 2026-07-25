package recursionByRaghavSir;

public class Reverse 
{
	public static void main(String[] args) 
	{
		int n = 5425;
		
		System.out.println(reverse(n , 0));
	}
	
	public static int reverse(int n , int r)
	{
		if(n == 0) return r;
		
		return reverse(n/10 , r*10 + n%10);
	}
}
