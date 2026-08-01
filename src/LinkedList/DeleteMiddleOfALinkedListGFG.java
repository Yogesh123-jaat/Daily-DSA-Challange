package LinkedList;

public class DeleteMiddleOfALinkedListGFG 
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
		
		System.out.println(deleteMid(a));  // isme puri linked list milti hai GFG par
	}
	
	// approach 2  slow fast approach
	
	public static Node deleteMid2(Node head)
	{
		if(head == null || head.next == null) return null;
		
		Node slow = head;
		Node fast = head;
		Node prev = null;
		
		while(fast != null && fast.next != null)
		{
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		prev.next = slow.next;
		
		return head;
	}
	
	public static Node deleteMid(Node head)
	{
		if(head == null || head.next == null) return null;
		
		Node temp = head;
		int length = 0;
		
		while(temp != null)
		{
			temp = temp.next;
			length++;
		}
		
		temp = head;
		
		for(int i = 0; i < length/2 - 1; i++)
		{
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		
		return head;
		
	}
}
