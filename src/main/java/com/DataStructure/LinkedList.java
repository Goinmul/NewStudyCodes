package com.DataStructure;


public class LinkedList {

	private Node head;
	private int size;

	// node form
	private class Node{ // although it is class form, think of it as a CONSTRUCTOR in C.
		private Object data; // data
		private Node next; // link

		// constructor(used when initialized with value)
		Node (Object data){
			this.data = data;
			this.next = null;
		}

	}

	// primarily, (head) -> null  // at this state, size == 0
	public void addFirst(Object data){
		Node newNode = new Node(data); // create a new node with data
		newNode.next = head.next; // linking
		head.next = newNode; // at this line, (head) -> (newNode) -> (head.nextNode)
		size++;
	}
	
	// index should start from 1. (head)--index 0, (head_next)--index 1
	private Node getNode(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("size is "+size+", input index : "+index);
		}
		Node node = head.next; // starting point.
		for (int i=0; i<index;i++) { // as many as index times,
			node = node.next; // traverse through link
		}
		// at the end of for loop, node will be the node of looking index.
		return node;
	}
	
	public Object getData(int index) {
		return getNode(index).data;
	}

}
