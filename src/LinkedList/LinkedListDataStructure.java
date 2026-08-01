package LinkedList;

class Node
{
	int val;
	Node next;
	
	Node(int val)
	{
		this.val = val;
	}
}

class Linkedlist
{
	Node head;
	Node tail;
	int size;
	
	void insertAtHead(int val)
	{
		Node temp = new Node(val);
		
		if(head == null) head = tail = temp;
		else
		{
			temp.next = head;
			head = temp;
		}
		
		size++;
	}
	
	void insertAtTail(int val)
	{
		Node temp = new Node(val);
		
		if(tail == null) head = tail = temp;  // if ye con true hoti hai to addAtHead() call kar sakte hai
		else
		{
//			Node temp = new Node(val);
			tail.next = temp;
			tail = temp;
//			size++;
		}
		
		size++;
	}
	
	void deleteAtHead()
	{
		if(head == null)
		{
			System.out.println("list is empty...");
			return;
		}
		
		head = head.next;
		
		if(head == null) tail = null;
		size--;
	}
	
	void display()
	{
		if(head == null) return;
		
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println(); 	
	}
	
	void insert(int val , int idx)
	{
		if(idx > size || idx < 0) 
		{
			System.out.println("Invalid Index...");
		}
		else if(idx == 0) insertAtHead(val);
		else if(idx == size) insertAtTail(val);
		else
		{
			Node temp = head;
			
			for(int i = 0; i < idx - 1; i++)
			{
				temp = temp.next;
			}
			
			Node t = new Node(val);
			t.next = temp.next;
			temp.next = t;
			size++;
		}
	}
	
	int get(int idx)
	{
		Node temp = head;
		
		for(int i = 0; i < idx; i++)
		{
			temp = temp.next;
		}
		
		return temp.val;
	}
	
	void delete(int idx)
	{
		if(idx >= size || idx < 0) 
		{
			System.out.println("Invalid size...");
			return;
		}
		if(idx == 0)
		{
			deleteAtHead();
			return;
		}
		
		Node temp = head;
		
		for(int i = 0; i < idx - 1; i++)
		{
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		if(idx == size - 1) tail = temp;
		size--;
	}
	
}

public class LinkedListDataStructure
{
	public static void main(String[] args) 
	{
		Linkedlist ll = new Linkedlist();
		ll.deleteAtHead();
		ll.insertAtTail(10);
		ll.insertAtTail(20);
		ll.insertAtTail(30);
		ll.insertAtTail(40);
		ll.display();
		ll.insertAtHead(50);
		ll.insertAtHead(60);
		ll.display();
		ll.deleteAtHead();
		ll.display();
		ll.insert(60, 3);
		ll.display();
		ll.delete(2);
		ll.display();
		
		System.out.println(ll.size);
		
	}
}
