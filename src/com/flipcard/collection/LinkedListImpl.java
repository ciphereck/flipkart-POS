package com.flipcard.collection;

import java.util.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
	      // add elements to the linked list
	     
		System.out.println("size of the Linked List =" +ll.size());
		 
		  ll.add("F");
	      ll.add("B");
	      ll.add("D");
	      ll.add("E");
	      ll.add("C");
	      ll.addLast("Z");
	      ll.addFirst("A");
	      ll.add(1, "A2");
	      System.out.println("Original contents of after Adding ll: " + ll.size());
	
	      System.out.println("Original contents of after Adding ll: " + ll);
	      
	      
	      // remove elements from the linked list
	      ll.remove("F");
	      System.out.println("Contents of ll after deletion: "+ ll);
	      ll.remove(2);
	      System.out.println("Contents of ll after deletion on 2 index: "+ ll);
	}

}
