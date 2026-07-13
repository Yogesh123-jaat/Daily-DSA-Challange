package Arrays;

public class Seggregation0And1 {

	public static void main(String[] args) 
	{
		int[] arr = {0,0,0,1,0}; // 1 0 1 0 1 0 0 
		
//		int nOfZeroes = 0;
//		int nOfOnes = 0;
		
//		for(int ele : arr)
//		{
//			if(ele == 0) nOfZeroes++;
//			else nOfOnes++;
//		}
		
//		for(int i = 0; i < nOfZeroes; i++)
//		{
//			arr[i] = 0;
//		}
//		
//		for(int i = nOfZeroes; i < arr.length; i++)
//		{
//			arr[i] = 1;
//		}
		
		//int n = arr.length;
		int i = 0; 
		int j = arr.length - 1;  // 1 0 1 0 1 0 0 
		
		while(i < j)
		{
			if(arr[i] == 0) i++;
			else if(arr[j] == 1) j--;
			else if(arr[i] == 1 && arr[j] == 0)
			{
				arr[i] = 0;
				arr[j] = 1;
				i++;
				j--;
			}
		}
		
		
		
		for(int ele : arr)
		{
			System.out.print(ele + " ");
		}
	}

}
