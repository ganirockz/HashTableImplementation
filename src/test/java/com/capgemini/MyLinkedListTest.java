package com.capgemini;
import org.junit.*;
public class MyLinkedListTest {
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.add(mySecondNode);
		linkedlist.add(myThirdNode);
		linkedlist.printMyNodes();
		Assert.assertTrue(linkedlist.getHead().getKey().equals(56));
	}
}
