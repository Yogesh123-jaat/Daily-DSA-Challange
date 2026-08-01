package LinkedList;

public class DeleteNode237L 
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
		
		delete(c);
		display(a);
	}
	
	public static void display(Node head)
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
	
	public static void delete(Node target)
	{
		target.val = target.next.val;
		target.next = target.next.next;
	}
}
