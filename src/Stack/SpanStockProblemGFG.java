package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class SpanStockProblemGFG 
{
	public static void main(String[] args) 
	{
		
	}
	
	public ArrayList<Integer> calculateSpan(int[] arr) 
    {
        int n = arr.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        
        st.push(0);
        span[0] = 1;
        
        for(int i = 1; i < n; i++)
        {
            while(st.size() > 0 && arr[i] >= arr[st.peek()]) st.pop();
            if(st.size() == 0) span[i] = i - (-1);
            else span[i] = i - st.peek();
            
            st.push(i);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
        {
            ans.add(span[i]);
        }
        
        return ans;
    }
}
