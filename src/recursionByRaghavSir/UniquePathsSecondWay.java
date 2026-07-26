package recursionByRaghavSir;

public class UniquePathsSecondWay 
{
	public static void main(String[] args) 
	{
		int m = 5;
		int n = 8;
		
		System.out.println(uniquePaths(m,n));  
	}
	public static int paths(int cr , int cc , int er , int ec)
	{
		if(er == cr && ec == cc) return 1;
		
		if(er < cr || ec < cc) return 0;
		
		int right = paths(cr , cc+1 , er , ec);
		int down = paths(cr+1 , cc , er , ec);
		
		return right + down;
	}
	
	public static int uniquePaths(int m , int n)
	{
		return paths(0 , 0 , m-1 , n-1);
	}
}
