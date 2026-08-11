package LinkedList;

import java.util.ArrayList;

public class MaximumTwinSumOfALinkedList 
{
	public static void main(String[] args) 
	{
		
	}
	public int pairSum(Node head) 
    {
        Node temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(temp != null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }

        int n = arr.size();

        int i = 0;
        int j = n - 1;
        int max = arr.get(0);
        while(i < j)
        {
            int ans = arr.get(i) + arr.get(j);
            if(ans >= max) max = ans;
            i++;
            j--;
        }

        return max;
    }
}
