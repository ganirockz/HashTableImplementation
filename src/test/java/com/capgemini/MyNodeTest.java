package com.capgemini;
import org.junit.*;

import com.capgemini.MyNode;
public class MyNodeTest {
	@Test
	public void given3NumbersWhenLinkedShouldPasedLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(34);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(47);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode)
				&&mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
