package LinkedList;

public class MiddleOfALinkedList876L 
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
		
		System.out.println(middleNode(a));
	}
	
	public static int middleNode(Node head)
	{
		Node temp = head;
		int length = 0;
		
		while(temp != null)
		{
			temp = temp.next;
			length++;
		}
		
		temp = head;
		
		for(int i = 0; i < length/2; i++)
		{
			temp = temp.next;
		}
		
		return temp.val;
	}
}
