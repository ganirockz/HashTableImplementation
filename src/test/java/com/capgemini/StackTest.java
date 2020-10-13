package com.capgemini;
import org.junit.*;
public class StackTest {
	@Test
	public void given3NumbersWhenAddedToStackShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyStack stack = new MyStack();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode peek = stack.peek();
		Assert.assertEquals(myThirdNode, peek);
	}
	@Test
	public void given3NumbersWhenPopToStackShouldBeReturnTheTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyStack stack = new MyStack();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode pop = stack.pop();
		Assert.assertEquals(mySecondNode, pop);
	}
}
