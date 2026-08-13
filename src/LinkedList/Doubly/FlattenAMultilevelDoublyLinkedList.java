package LinkedList.Doubly;

public class FlattenAMultilevelDoublyLinkedList
{
	public static void main(String[] args) 
	{
			
	}
	public ListNode flatten(ListNode head)   // 430 Leetcode
    {
        if(head == null) return head;
        ListNode temp = head;

        while(temp != null)
        {
            if(temp.child == null)
            {
                temp = temp.next;
            }
            else
            {
                ListNode a = temp.next;
                ListNode c = flatten(temp.child);
                temp.child = null;
                temp.next = null;
                temp.next = c;

                c.prev = temp;

                ListNode d = c;

                while(d != null && d.next != null)
                {
                    d = d.next;
                }

                d.next = a;
                if(a != null) a.prev = d;

                temp = a;
            }
        }    

        return head;
    }
}
