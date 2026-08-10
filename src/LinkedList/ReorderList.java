package LinkedList;

public class ReorderList
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
	
	public static void reorderList(Node head)
	{
		if(head == null || head.next == null) return;
		
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node head2 = slow.next;
		slow.next = null;
		
		head2 = reverse(head2);
		
		Node dummy = new Node(-1);
		Node t1 = head;
		Node t2 = head2;
		Node t = dummy;
		
		while(t1 != null && t2 != null)
		{
			t.next = t1;
			t = t.next;
			t1 = t1.next;
			
			t.next = t2;
			t = t.next;
			t2 = t2.next;
		}
		
		if(t1 == null)
		{
			t.next = t2;
		}
		else
		{
			t.next = t1;
		}
	}
}
