package LinkedList;

public class RemoveDuplicatesFromLinkedList2L82 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node deleteDuplicates(Node head)
	{
		Node dummy = new Node(-1);
		
		Node t = dummy;
		Node i = head;
		
		while(i != null)
		{
			if(i.next == null || i.val != i.next.val)
			{
				t.next = i;
				t = i;
				i = i.next;
			}
			else
			{
				Node j = i.next;
				
				while(j != null && j.val == i.val)
				{
					j = j.next;
				}
				i = j;
			}
		}
		t.next = i;
		
		return dummy.next;
	}
}
