package datastructure;

public class LinkedListOfInteger {
	/*
	 * a user-defined linked list implementation for Integer object
	 */
	private Node first, last;

	private class Node {
		Integer item;
		Node next;
	}

	public LinkedListOfInteger() {
		super();
	}

	public LinkedListOfInteger(Node first, Node last) {
		super();
		this.first = first;
		this.last = last;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void enqueue(Integer item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty())
			first = last;
		else
			oldlast.next = last;
	}

	public Integer dequeue() {
		Integer item = first.item;
		first = first.next;
		if (isEmpty())
			last = null;
		return item;
	}

	public Integer get(int index) {
		Integer getItem;
		Node getNode = first;
		for (int i = 0; i < index; i++) {
			getNode = first.next;
		}
		getItem = getNode.item;

		return getItem;

	}

}
