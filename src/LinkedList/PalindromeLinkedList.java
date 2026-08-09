package LinkedList;

import java.util.ArrayList;

public class PalindromeLinkedList
{
	public static void main(String[] args) 
	{
		
	}
	public static boolean isPalindrome(Node head) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;

        while(temp != null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }    

        int i = 0;
        int j = arr.size() - 1;

        while(i < j)
        {
            if(arr.get(i) != arr.get(j)) return false;
            i++;
            j--;
        }

        return true;
    }
	
	public static Node reverse(Node head)
	{
		Node curr = head;
        Node prev = null;
        Node fwd = null;
        
        while(curr != null)
        {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        
        return prev;
	}
	
	public static boolean palindrome(Node head)
	{
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node head2 = slow.next;
		slow.next = null;
		
		head2 = reverse(head2);
		
		Node i = head;
		Node j = head2;
		
		while(i != null && j != null)
		{
			if(i.val != j.val) return false;
			i = i.next;
			j = j.next;
		}
		
		return true;
	}
}
