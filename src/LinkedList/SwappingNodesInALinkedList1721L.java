package LinkedList;

public class SwappingNodesInALinkedList1721L 
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
		
		swapNodes(a , k);
	}
	
	public static Node swapNodes(Node head, int k) 
    {
        Node first = head;
        Node t = head;
        int length = 0;
        while(t != null)
        {
            t = t.next;
            length++;
        }

        for(int i = 0; i < k - 1; i++)
        {
            first = first.next;
        }

        Node second = head;
        for(int i = 0; i < length - k; i++)
        {
            second = second.next;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}
