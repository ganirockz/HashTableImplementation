package com.capgemini;

import org.junit.*;

public class SortedLinkedListTest {
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedInSortedOrder() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		SortedLinkedList linkedlist = new SortedLinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.add(mySecondNode);
		linkedlist.add(myThirdNode);
		linkedlist.printMyNodes();
		Assert.assertTrue(linkedlist.getHead().getKey().equals(30));
	}
}
