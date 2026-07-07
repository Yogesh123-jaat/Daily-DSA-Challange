package Arrays;

public class MergeTwoSortedarrayInReverseWay 
{
	public static void main(String[] args) 
	{
		int[] a = {2,5,6,9,20};
		int[] b = {1,3,4,5,7,8,10,15};
		
		int[] c = new int[a.length + b.length];
		merge(c , a , b);
		for(int ele : c)
		{
			System.out.print(ele + " ");
		}
	}
	
	public static void merge(int[] c , int[] a , int[] b)
	{
		int i = a.length - 1;
		int j = b.length - 1;
		int k = c.length - 1;
		
		while(i >= 0 && j >= 0)
		{
			if(a[i] > b[j])
			{
				c[k--] = a[i--];
			}
			else
			{
				c[k--] = b[j--];
			}
		}
		
		while(j >= 0)
		{
			c[k--] = b[j--];
		}
		while(i >= 0)
		{
			c[k--] = a[i--];
		}
	}
}
