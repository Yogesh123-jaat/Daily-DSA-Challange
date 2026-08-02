package LinkedList;

public class LinkedListCycleFirstNode142L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node detectCycle(Node head)
	{
		if(head == null || head.next == null) return null;
		
		Node slow = head;
		Node fast = head;
		Node b = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast == slow)
			{
				break;
			}
		}
		
		if(fast == null && fast.next == null) return null;
		
		while(b != slow)
		{
			b = b.next;
			slow = slow.next;
		}
		
		return slow;
	}
}
