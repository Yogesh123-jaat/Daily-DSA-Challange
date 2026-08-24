package Queues;

import java.util.Stack;

class QueueStack 
{
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    public QueueStack() 
    {
        
    }
    
    public void push(int x) 
    {
        st.push(x);    
    }
    
    public int pop() // TC & SC : O(n)
    {
        while(st.size() > 1)
        {
            helper.push(st.pop());
        }

        int front = st.pop();

        while(helper.size() > 0)
        {
            st.push(helper.pop());
        }

        return front;
    }
    
    public int peek()   // TC & SC : O(n)
    {
        while(st.size() > 1)
        {
            helper.push(st.pop());
        }

        int front = st.peek();

        while(helper.size() > 0)
        {
            st.push(helper.pop());
        }

        return front;
    }
    
    public boolean empty() 
    {
        return (st.size() == 0);  
    }
}
public class QueueImplementationByQueue
{
	public static void main(String[] args) 
	{
		
	}
}
