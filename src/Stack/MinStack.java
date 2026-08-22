package Stack;

import java.util.Stack;

public class MinStack 
{
	Stack<Integer> MainStack;
    Stack<Integer> MinStack;
    public MinStack() 
    {   
        MinStack = new Stack();
        MainStack = new Stack();
    }
    
    public void push(int value) 
    {
        MainStack.push(value);
        if(MinStack.isEmpty() || value <= MinStack.peek())
        {
            MinStack.push(value);
        }
        else
        {
            MinStack.push(MinStack.peek());
        }  
    }
    
    public void pop() 
    {
        MainStack.pop();
        MinStack.pop();
    }
    
    public int top() 
    {
        return MainStack.peek();
    }
    
    public int getMin() 
    {
        return MinStack.peek();
    }
}
