package LinkedList;

public class SegregateEvensandOddsinaLinkedListGFG
{
	public static void main(String[] args) 
	{
		
	}
	public static Node divide(Node head) {
        
        Node d1 = new Node(-1);   // odd
        Node d2 = new Node(-1);   // even

        Node t1 = d1;
        Node t2 = d2;

        Node t = head;

        while(t != null)
        {
            if(t.val % 2 != 0)
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
        }    

        t1.next = null;
        t2.next = null;

        t2.next = d1.next;
        
        return d2.next;
        
    }
}
