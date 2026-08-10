package LinkedList;

public class SwapNodesInPairs 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node oddEvenList(Node head) 
    {
        Node temp = head;
        int len = 0;
        while(temp != null)
        {
            temp = temp.next;
            len++;
        }

        int n = len;

        Node d1 = new Node(-1);   // odd
        Node d2 = new Node(-1);   // even

        Node t1 = d1;
        Node t2 = d2;

        Node t = head;
        len = 1;
        while(t != null)
        {
            if(len > n)
            {
                break;
            }

            if(len % 2 != 0)
            {
                t1.next = t;
                t1 = t1.next;
            }
            else
            {
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
            len++;
        }    

        t1.next = null;
        t2.next = null;

        d1 = d1.next;
        d2 = d2.next;
        Node d3 = new Node(-1);
        Node fin = d3;
        len = 1;

        while(d1 != null && d2 != null)
        {
            if(len > n) break;

            if(len % 2 == 1) 
            {
                d3.next = d2;
                d2 = d2.next;
            }
            else 
            {
                d3.next = d1;
                d1 = d1.next;
            }
            d3 = d3.next;
            len++;
        }

        if(d1 == null) d3.next = d2;
        else d3.next = d1;

        return fin.next;  
    }
    public static Node swapPairs(Node head) 
    {
//        if(head == null || head.next == null) return head;
//
//        return oddEvenList(head);
    	
    	if(head == null || head.next == null) return head;
    	
    	Node dummy = new Node(-1);
    	
    	Node a = head;
    	Node b = head.next;
    	
    	Node c = dummy;
    	
    	while(a != null && b != null)
    	{
    		c.next = b;
    		a.next = b.next;
    		b.next = a;
    		c = a;
    		a = a.next;
    		if (a != null) b = a.next;
    	}
    	
    	return dummy.next;

    }
}
