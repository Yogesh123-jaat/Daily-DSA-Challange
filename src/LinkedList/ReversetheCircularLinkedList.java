package LinkedList;

public class ReversetheCircularLinkedList
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
    public static Node reverseCircular(Node head) 
    {
        if(head == null || head.next == null) return head;
        Node tail = head;
        
        while(tail.next != head)
        {
            tail = tail.next;
        }
        tail.next = null;
        
        Node oldHead = head;

        head = reverse(head);

        oldHead.next = head;

        return head;
    }
}
