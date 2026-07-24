package twoDArraylist;

import java.util.ArrayList;

public class MatricsMultiply 
{
	public static void main(String[] args) 
	{
		int a[][] = {{1,2},{3,4}};
		int b[][] = {{5,6},{7,8}};
		
		System.out.println(multiplyMatrices(a , b));
	}
	
	public static ArrayList<ArrayList<Integer>> multiplyMatrices(int[][] a, int[][] b) 
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        int n = a.length;
        for(int i = 0; i < n; i++)
        {
            ans.add(new ArrayList<>());
            for(int j = 0; j < n; j++)
            {
                int sum = 0;
                for(int k = 0; k < n; k++)
                {
                    sum += a[i][k] * b[k][j];
                }
                ans.get(i).add(sum);
            }
        }
        
        return ans;
    }
}
