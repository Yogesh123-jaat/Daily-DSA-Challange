package LinkedList;

public class RemoveDuplicateFromSortedList83L 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static Node deleteDuplicates(Node head)
	{
		if(head == null) return null;
		
		Node i = head;
		Node j = head;
		
		while(j != null)
		{
			if(i.val == j.val) j = j.next;
			else
			{
				i.next = j;
				i = j;
			}
		}
		
		i.next = j;
		
		return head;
	}
}
