package recursionByRaghavSir;

public class RaiseToPowerOfItsOwnRev 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		System.out.println(reverseExponentiation(n));
	}
	
	 public static int pow(int a , int b)
	    {
	        if(b == 0) return 1;
	        
	        int call = pow(a,b/2);
	        
	        if(b % 2 == 0) return call * call;
	        else return a * call * call;
	    }
	    public static int reverseExponentiation(int n) 
	    {
	        if(n == 10) return 10;
	        
	        return pow(n,n);
	    }
}
