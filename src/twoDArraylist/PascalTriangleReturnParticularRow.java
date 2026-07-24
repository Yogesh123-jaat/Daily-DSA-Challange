package twoDArraylist;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleReturnParticularRow
{
	public static void main(String[] args) 
	{
		System.out.println(generate(3));
	}
	
	public static List<Integer> generate(int rowIndex)
	{
		int n = rowIndex + 1;
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int i = 0; i < n; i++)
		{
			List<Integer> list = new ArrayList<>();
			for(int j = 0; j <= i; j++)
			{
				list.add(1);
			}
			ans.add(list);
		}
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				if(j == 0 || j == i)
				{
					ans.get(i).set(j,1);
				}
				else
				{
					ans.get(i).set(j, ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
				}
			}
		}
		
		return ans.get(rowIndex);
	}
}
