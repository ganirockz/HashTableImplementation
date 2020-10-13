package com.capgemini;

public class MyLinkedList <K>{
	private INode<K> head;
	private INode<K> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode<K> getHead() {
		return this.head;
	}

	public void setHead(INode<K> head) {
		this.head = head;
	}

	public void add(INode<K> myNode) {
		if (this.tail == null) {
			this.tail = myNode;
		}
		if (this.head == null) {
			this.head = myNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}
	}

	public void append(INode<K> myNode) {
		if (this.tail == null) {
			this.tail = myNode;
		}
		if (this.head == null) {
			this.head = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public void addInMiddle(INode myNode) {
		int middle = size() / 2;
		int index = 0;
		INode<K> tempNode = this.head;
		while (index + 1 != middle) {
			tempNode = tempNode.getNext();
		}
		myNode.setNext(tempNode.getNext());
		tempNode.setNext(myNode);
	}

	public void insert(INode<K> newNode, INode<K> nextNode) {
		int flag = 0;
		if (size() == 0) {
			System.out.println("No nodes to insert");
		} else {
			INode<K> tempNode = this.head;
			INode<K> prevNode = null;
			while (tempNode != nextNode) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			flag++;
			newNode.setNext(tempNode);
			if (tempNode == head) {
				this.setHead(newNode);
			} else {
				prevNode.setNext(newNode);
			}
		}
		if (flag == 0) {
			System.out.println("There is no node with " + nextNode.getKey() + " as key");
		}
	}

	public void delete(int nodeKey) {
		if (size() == 0) {
			System.out.println("No nodes to delete");
		} else {
			int flag = 0;
			INode<K> tempNode = this.head;
			INode<K> prevNode = this.head;
			while (!(tempNode.getKey().equals(nodeKey))) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			prevNode.setNext(tempNode.getNext());
			flag++;
			if (flag == 0) {
				System.out.println("No node with key as " + nodeKey);
			}
		}
	}

	public void printMyNodes() {
		/*INode<K> tempNode = this.head;
		if (tempNode == null) {
			System.out.println("No nodes present");
		}
		while (tempNode != null) {
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}*/
		System.out.println("My Nodes: "+head);
	}
	public String toString() {
		return "MylinkedList:{"+head+"};";
	}

	public INode<K> search(K k) {
		INode<K> tempNode = this.head;
		while (tempNode != null) {
			if (tempNode.getKey().equals(k)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public INode<K> popLast() {
		int size = size();
		if (size == 0) {
			System.out.println("No nodes present");
		} else {
			INode<K> tempNode = this.head;
			while (tempNode.getNext().getNext() != null) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			this.tail = tempNode;
		}
		return this.tail;
	}

	public INode<K> pop() {
		if (size() == 0) {
			System.out.println("No nodes present");
			return null;
		} else {
			this.head = head.getNext();
			return this.head;
		}
	}

	public int size() {
		INode<K> tempNode = this.head;
		int count = 0;
		while (tempNode != null) {
			tempNode = tempNode.getNext();
			count++;
		}
		return count;
	}
}
