package Queues;

import java.util.Queue;
import java.util.Stack;

public class RearraneQueueUsingSingleStackGFG
{
	public static void main(String[] args) 
	{
		
	}
	public void rearrangeQueue(Queue<Integer> q) 
    {
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 1; i <= n/2; i++)
        {
            st.push(q.remove());
        }
        while(st.size() > 0)
        {
            q.add(st.pop());
        }
        for(int i = 1; i <= n/2; i++)
        {
            st.push(q.remove());
        }
        while(st.size() > 0)
        {
            q.add(st.pop());
            q.add(q.remove());
        }
        while(q.size() > 0)
        {
            st.push(q.remove());
        }
        while(st.size() > 0)
        {
            q.add(st.pop());
        }
    }
}
