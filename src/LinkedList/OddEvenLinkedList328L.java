package LinkedList;

public class OddEvenLinkedList328L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node List(Node head)
	{
		Node odd = new Node(-1);
        Node even = new Node(-1);
        Node t1 = odd;
        Node t2 = even;
        Node t = head;

        while(t != null)
        {
            t1.next = t;
            t = t.next;
            t1 = t1.next;

            t2.next = t;
            if(t != null) t = t.next;
            t2 = t2.next;
        } 

        t1.next = even.next;
        return odd.next;
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

        t1.next = d2.next;

        return d1.next;  
    }
}
