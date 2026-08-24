package Queues;

import java.util.Stack;

class pEffiStack
{
	Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    public pEffiStack() 
    {
        
    }

    public void push(int x) // TC & SC : O(n)
    {
        while(st.size() > 0)
        {
            helper.push(st.pop());
        }
        st.push(x);
        while(helper.size() > 0)
        {
            st.push(helper.pop());
        }
    }
    
    public int pop() // TC & SC : O(1)
    {
        return st.pop();
    }
    
    public int peek()   // TC & SC : O(1)
    {
        return st.peek();
    }
    
    public boolean empty() 
    {
        return (st.size() == 0);  
    }
}
public class QueueImpByStackPopEffiApp 
{

}
