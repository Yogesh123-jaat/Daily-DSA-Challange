package Arrays;

public class MaxWealth {

	public static void main(String[] args) 
	{
		int[][] arr = {
				{5,6,7},
				{9,8,7},
				{1,2,3}
		};
		
		System.out.println(maxWealth(arr));
	}
	
	static int maxWealth(int[][] arr)
	{
		int sum = 0;
		int ans = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum = 0;
			for(int j = 0; j < arr[i].length; j++)
			{
				sum += arr[i][j];
			}
			if(sum > ans)
			{
				ans = sum;
			}
		}
		
		return ans;
		
	}

}
