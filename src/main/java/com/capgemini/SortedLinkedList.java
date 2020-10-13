package com.capgemini;

public class SortedLinkedList {
	private INode<Integer> head;
	private INode<Integer> tail;

	public SortedLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode<Integer> getHead() {
		return this.head;
	}

	public void setHead(INode<Integer> head) {
		this.head = head;
	}

	public void add(INode<Integer> myNode) {
		if (this.tail == null) {
			this.tail = myNode;
		}
		if (this.head == null) {
			this.head = myNode;
		} else {
			INode<Integer> tempNode = this.head;
			while(tempNode.getKey().compareTo(myNode.getKey())<0) {
				tempNode = tempNode.getNext();
			}
			this.insert(myNode, tempNode);
		}
	}

	public void append(INode<Integer> myNode) {
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
		INode<Integer> tempNode = this.head;
		while (index + 1 != middle) {
			tempNode = tempNode.getNext();
		}
		myNode.setNext(tempNode.getNext());
		tempNode.setNext(myNode);
	}

	public void insert(INode newNode, INode nextNode) {
		int flag = 0;
		if (size() == 0) {
			System.out.println("No nodes to insert");
		} else {
			INode<Integer> tempNode = this.head;
			INode<Integer> prevNode = null;
			while (tempNode != nextNode) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			flag++;
			newNode.setNext(tempNode);
			if(tempNode == head) {
				this.setHead(newNode);
			}
			else {
				prevNode.setNext(newNode);
			}
		}
		if(flag == 0) {
			System.out.println("There is no node with "+nextNode.getKey()+" as key");
		}
	}
	public void delete(int nodeKey) {
		if(size() == 0) {
			System.out.println("No nodes to delete");
		}
		else {
			int flag = 0;
			INode<Integer> tempNode = this.head;
			INode<Integer> prevNode = this.head;
			while (!(tempNode.getKey().equals(nodeKey))) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			prevNode.setNext(tempNode.getNext());
			flag++;
			if(flag == 0) {
				System.out.println("No node with key as "+nodeKey);
			}
		}
	}
	public void printMyNodes() {
		INode<Integer> tempNode = this.head;
		if (tempNode == null) {
			System.out.println("No nodes present");
		}
		while (tempNode != null) {
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}
	}

	public boolean search(int k) {
		INode tempNode = this.head;
		while (tempNode != null) {
			if (tempNode.getKey().equals(k)) {
				return true;
			}
			tempNode = tempNode.getNext();
		}
		return false;
	}

	public INode popLast() {
		int size = size();
		if (size == 0) {
			System.out.println("No nodes present");
		} else {
			INode<Integer> tempNode = this.head;
			while (tempNode.getNext().getNext() != null) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			this.tail = tempNode;
		}
		return this.tail;
	}

	public INode pop() {
		if (size() == 0) {
			System.out.println("No nodes present");
			return null;
		} else {
			this.head = head.getNext();
			return this.head;
		}
	}

	public int size() {
		INode<Integer> tempNode = this.head;
		int count = 0;
		while (tempNode != null) {
			tempNode = tempNode.getNext();
			count++;
		}
		return count;
	}
}
