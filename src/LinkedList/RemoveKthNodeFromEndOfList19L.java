package LinkedList;

public class RemoveKthNodeFromEndOfList19L 
{
	public static void main(String[] args) 
	{
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;  // optional
		int k = 2;
		removeKthFromEnd1(a , k);
	}
	
	public static Node removeKthFromEnd1(Node head , int k)
	{
		if(head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;
        Node prev = null;

        for(int i = 0; i < k; i++)
        {
            fast = fast.next;
        }

        if(fast == null)
        {
            return head.next;
        }

        while(fast != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = slow.next;

        return head;
	}
	
	public Node removeNthFromEnd2(Node head, int k) 
    {
		
        if(head == null || head.next == null) return null;
        Node temp = head;
        int length = 0;

        while(temp != null)
        {
            temp = temp.next;
            length++;
        }    

        if(length == k) return head.next;

        temp = head;

        for(int i = 0; i < length - k - 1; i++)
        {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
