package twoDArraylist;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3} , {4,5,6} , {7,8,9}};
		
		System.out.println(spiralOrder(arr));
	}
	
	public static List<Integer> spiralOrder(int[][] arr) 
    {
        List<Integer> list = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        int firstRow =  0;
        int lastRow = m - 1;
        int firstCol = 0;
        int lastCol = n - 1;

        while(firstRow <= lastRow && firstCol <= lastCol)
        {
            for(int i = firstRow; i <= lastCol; i++) // Right
            {
                list.add(arr[firstRow][i]);
            }
            firstRow++;
            if(firstRow > lastRow || firstCol > lastCol) break;

            for(int i = firstRow; i <= lastRow; i++) // down
            {
                list.add(arr[i][lastCol]);
            }
            lastCol--;
            if(firstRow > lastRow || firstCol > lastCol) break;

            for(int i = lastCol; i >= firstCol; i--) // left
            {
                list.add(arr[lastRow][i]);
            }
            lastRow--;
            if(firstRow > lastRow || firstCol > lastCol) break;

            for(int i = lastRow; i >= firstRow; i--) // up
            {
                list.add(arr[i][firstCol]);
            }
            firstCol++;
            if(firstRow > lastRow || firstCol > lastCol) break;

        }    
        return list;
    }
}
