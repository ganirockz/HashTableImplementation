package com.capgemini;

public interface INode<E> {
	E getKey();
	void setKey(E key);

	INode<E> getNext();

	void setNext(INode<E> a);
}
