package Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeinWindowsofSizeK 
{
	public static void main(String[] args)  
	{
		int[] arr = {-8, 2, 3, -6, 10};
		
		System.out.println(firstNegInt(arr , 2));
	}
	
	static List<Integer> firstNegInt(int arr[], int k) // TC : O(n)   
    {
		ArrayList<Integer> ans = new ArrayList<>();
		int n = arr.length;
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 0; i < n; i++)
		{
			if(arr[i] < 0) q.add(i);
		}
		
		for(int i = 0; i < n-k+1; i++)
		{
			while(q.size() > 0 && q.peek() < i) q.remove();
			if(q.size() > 0 && q.peek() <= i+k-1) ans.add(arr[q.peek()]);
			else ans.add(0);
		}
		
		return ans;
    }
	
	static List<Integer> firstNegInt2(int arr[], int k) 
	 {
       ArrayList<Integer> ans = new ArrayList<>();
       int n = arr.length;
       boolean flag = false;
       
       for(int i = 0; i < n-k+1; i++)
       {
           // flag = false;
           for(int j = i; j < i+k; j++)
           {
               if(arr[j] < 0) 
               {
                   ans.add(arr[j]);
                   break;
               }
               if(j == i+k-1 && arr[j] >= 0) 
               {
                   ans.add(0);
               }
           }
       }
       
       return ans;
	 }  // TC : O(n*k)
}
