package LinkedList;

public class AddNumberLinkedLists 
{
	public static void main(String[] args) 
	{
		
	}
	
	public Node reverse(Node head)
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
    public Node addTwoLists(Node head1, Node head2) 
    {
        while(head1 != null && head1.val == 0)
        {
            head1 = head1.next;
        }
        
        while(head2 != null && head2.val == 0)
        {
            head2 = head2.next;
        }
        
        if(head1 == null && head2 == null)
        {
            return new Node(0);
        }
        
        head1 = reverse(head1);
        head2 = reverse(head2);
        
        Node t1 = head1;
        Node t2 = head2;
        
        int carry = 0;
        
        Node dummy = new Node(-1);
        Node t = dummy;
        
        while(t1 != null || t2 != null)
        {
            
            int val1 = (t1 != null) ? t1.val : 0;
            int val2 = (t2 != null) ? t2.val : 0;
        
            int sum = carry + val1 + val2;
            if(sum >= 10) carry = 1;
            else carry = 0;
            
            Node a = new Node(sum % 10);
            t.next = a;
            t = t.next;
            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }
        
        if(carry == 1)
        {
            Node a = new Node(carry);
            t.next = a;
            t = t.next;
        }
        
        return reverse(dummy.next);
    }
}
