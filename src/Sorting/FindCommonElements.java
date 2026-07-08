package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {

	public static void main(String[] args)
	{
		int[] arr = {3,1,2,1,1,4,5,5};
		int[] brr = {6,1,1,4,4,2,8};
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(commonElements(arr , brr , list));
	}
	public static ArrayList<Integer> commonElements(int[] a , int[] b , ArrayList<Integer> list)
	{
		int i = 0;
		int j = 0;
		
		while(i < a.length && j < b.length)
		{
			if(a[i] == b[j]) 
			{
				list.add(a[i]);
				i++;
				j++;
			}
			else if(a[i] > b[j]) j++;
			else if(a[i] < b[j]) i++;
		}
		
		return list;
	}
}
