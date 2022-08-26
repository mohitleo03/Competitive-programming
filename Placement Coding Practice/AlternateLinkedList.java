// Java program to rearrange a linked list in given manner
import java.util.*;
import java.lang.*;
import java.io.*;

class AlternateLinkedList
{
	/* Link list node */
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	// printing the linked list
	static void printList(Node head)
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	/* Function to reverse the linked list */
	static void arrange(Node head)
	{
		// defining a deque
		Deque<Integer> deque = new ArrayDeque<>();
		Node temp = head;
		
		// push all the elements of linked list in to deque
		while(temp != null)
		{
			deque.addLast(temp.data);
			temp = temp.next;
		}
		temp = head;
		int i = 0;
		
		// Alternatively push the first and last elements
		// from deque to back to the linked list and pop
		while(!deque.isEmpty())
		{
			if(i % 2 == 0)
			{
				temp.data = deque.removeFirst();
			}
			else
			{
				temp.data = deque.removeLast();
			}
			i++;
			temp = temp.next;
		}
	}

	// Driver code
	public static void main (String[] args)
	{
		// Let us create linked list 1->2->3->4->5
		Node head = null;
		
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		System.out.println("Given linked list");
		printList(head);
		arrange(head);
		System.out.println("\nAfter rearrangement");
		printList(head);
	}
}

// This code is contributed by nobody_cares.
