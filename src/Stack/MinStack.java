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

class AnotherMethod {
    Stack<Long> MainStack;
    long min;
    public AnotherMethod() 
    {   
        MainStack = new Stack();
        min = Long.MAX_VALUE;
    }
    
    public void push(int value) 
    {
        long val = (long)value;
        if(MainStack.size() == 0) min = val;
        if(val >= min)
        {
            MainStack.push(val);
        } 
        else
        {
            MainStack.push(val + val - min);
            min =val;
        }
    }
    
    public void pop() 
    {
        if(MainStack.peek() < min) min = min + (min - MainStack.peek());
        MainStack.pop();
    }
    
    public int top() 
    {
        long a = MainStack.peek();
        if(a < min) return (int)min;
        else return (int)a;
    }
    
    public int getMin() 
    {
        return (int)min;
    }
}
