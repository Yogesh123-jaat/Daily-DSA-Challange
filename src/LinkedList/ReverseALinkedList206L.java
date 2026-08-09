package LinkedList;

import java.util.ArrayList;

public class ReverseALinkedList206L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node reverse(Node head)
	{
		Node curr = head;
        Node prev = null;
        Node fwd = null;
        
        while(curr != null)
        {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        
        return prev;
	}
	
	public static Node reverseList(Node head) 
	{        
        if(head == null) return null;
        Node temp = head;
        ArrayList<Node> arr = new ArrayList<>();
        
        while(temp != null)
        {
            arr.add(temp);
            temp = temp.next;
        }
        
        int n = arr.size();
        for(int i = n - 1; i >= 1; i--)
        {
//        	Node t1 = arr.get(i);
//        	Node t2 = arr.get(i-1);
//        	t1.next = t2; 
            arr.get(i).next = arr.get(i-1);
        }
        arr.get(0).next = null;
        return arr.get(n-1);
    }
	
	public static Node reverseRec(Node head)
	{
		if(head == null || head.next == null) return head;
		
		Node a = head.next;
		head.next = null;
		
		Node b = reverseRec(a);
		a.next = head;
		return b;
	}
	
	
}
