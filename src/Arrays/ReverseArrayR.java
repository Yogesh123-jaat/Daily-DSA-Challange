package Arrays;

public class ReverseArrayR 
{

	public static void main(String[] args) 
	{
		int[] arr = {6 , 8 , 1 , 2 , 4 , 9 , 0};
		
//		int n = arr.length;
//		
//		for(int i = 0; i < n/2; i++)
//		{
//			int temp = arr[i];
//			arr[i] = arr[n - i - 1];
//			arr[n - i - 1] = temp;
//		}
		
		int i = 0;
		int j = arr.length - 1;
		
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		for(int ele : arr)
		{
			System.out.print(ele + " ");
		}
	}

}
