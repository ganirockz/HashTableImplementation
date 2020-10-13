package com.capgemini;

public class MyStack {
	private MyLinkedList myLinkedList;
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}
	public void printStack() {
		myLinkedList.printMyNodes();
	}
	public INode peek() {
		return myLinkedList.getHead();
	}
	public INode pop() {
		return myLinkedList.pop();
	}
	
}
