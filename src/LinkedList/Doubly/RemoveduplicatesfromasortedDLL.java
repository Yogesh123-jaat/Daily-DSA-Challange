package LinkedList.Doubly;

public class RemoveduplicatesfromasortedDLL
{
	public static void main(String[] args) 
	{
		
	}
	public static ListNode removeDuplicates(ListNode headRef) 
    {
        if(headRef == null || headRef.next == null) return headRef;
        
        ListNode temp1 = headRef;
        ListNode temp2 = temp1.next;
        
        while(temp2 != null)
        {
            if(temp1.val == temp2.val)
            {
                temp1.next = temp2.next;
                if(temp2.next != null) temp2.next.prev = temp1;
                
                temp2 = temp1.next;
            }
            else
            {
                temp1 = temp1.next;
                temp2 = temp2.next;   
            }
        }
        
        return headRef;
    }
}
