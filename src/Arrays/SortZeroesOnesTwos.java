package Arrays;

public class SortZeroesOnesTwos {

	public static void main(String[] args) 
	{
		int[] arr = {0,0,0,1,0,2,1,1,2,0,0,1,0,2,0,1};
		
		int nOfZeroes = 0;
		int nOfOnes = 0;
		int nOfTwos = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 0) nOfZeroes++;
			else if(arr[i] == 1) nOfOnes++;
			else nOfTwos++;
		}
		
		for(int i = 0; i < nOfZeroes; i++)
		{
			arr[i] = 0;
		}
		
		for(int i = nOfZeroes; i < (nOfOnes+nOfZeroes); i++)
		{
			arr[i] = 1;
		}
		
		for(int i = (nOfOnes+nOfZeroes); i < arr.length; i++)
		{
			arr[i] = 2;
		}
		
		
		for(int ele : arr)
		{
			System.out.print(ele + " ");
		}
	}

}
