package com.DataStructure;


public class LinkedList {

	private Node head; // head index is null. practical node starts from head_next_node (index 0).
	private int size;

	// node form
	private class Node{ // although it is class form, think of it as a CONSTRUCTOR in C.
		private Object data; // data
		private Node next = null; // link

		// constructor(used when initialized with value)
		Node (Object data){
			this.data = data;
			this.next = null;
		}

	}

	// primarily, (head) -> null  // at this state, size == 0
	public void add_first(Object data) {
		Node newNode = new Node(data); // create a new node with data
		newNode.next = head.next; // linking
		head.next = newNode; // at this line, (head) -> (newNode) -> (head.nextNode) -> null
		size++;
	}

	public void add_last(Object data) {
		Node newNode = new Node(data);
		Node node = getNode(this.size - 1); // since index is (size - 1), now 'node' is the last node
		node.next = newNode; // newNode is added on the tail
	}

	// @param index : adding node after that index
	public void add(Object data, int index) { // adding in the midst of the linked list. 
		Node newNode = new Node(data);
		Node node = getNode(index);
		node.next = newNode;
	}

	public void delete(int index) {
		if (index == 0 && size == 1) { // deleting next, when (head) -> (next) -> null.
			head.next = null;
		}
		else {
			Node previous = getNode(index-1);
			//Node node_to_delete = getNode(index);
			//node_to_delete.next = null;
			previous.next = previous.next.next;
		}
	}

	// (head)--index null, (head_next)--index 0
	private Node getNode(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("size is " + size + ", input index : " + index);
		}
		Node node = head.next; // starting point.
		for (int i=0; i < index ;i++) { // as many as index times,
			node = node.next; // traverse through link
		}
		// at the end of for loop, node will be the node of looking index.
		return node;
	}

	public Object getData(int index) {
		return getNode(index).data;
	}
	
	public void printNode() {
		for (int i =0; i < size; i++) {
			Node node = getNode(0);
			System.out.println("#" + i + " node data : " + node.data);
			node = node.next;
		}
	}

}
