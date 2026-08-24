package Queues;

import java.util.LinkedList;
import java.util.Queue;

class MyEffiStack
{
    Queue<Integer> q = new LinkedList<>();
    public MyEffiStack() {
        
    }

    public void push(int x) // TC & SC : O(n) 
    {
        q.add(x);
        int n = q.size();

        for(int i = 1; i < n; i++)
        {
            q.add(q.remove());
        }
    }
    
    public int pop()  // TC & SC : O(1) 
    {
        return q.remove();
    }
    
    public int top() // TC & SC : O(1) 
    {
        return q.peek();
    }
    
    public boolean empty() 
    {
        return (q.size() == 0);    
    }
}
public class ImplementStackUsingQueue2 
{
	public static void main(String[] args) 
	{
		
	}
}
