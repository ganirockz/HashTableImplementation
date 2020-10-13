package com.capgemini;

public class MyNode<E> implements INode<E>{
	
	private INode<E> next;
	private E key;
	public MyNode(E key) {
		this.key = key;
		this.next = null;
	}
	public void setKey(E key) {
		this.key = key;
	}
	public E getKey() {
		return this.key;
	}
	public void setNext(INode<E> next) {
		this.next = next;
	}
	public INode<E> getNext() {
		return this.next;
	}
	
}
