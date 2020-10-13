package com.capgemini;
import org.junit.*;
public class MyQueueTest {
	@Test
	public void givenNodeWhenEnqueueCalledShouldAddToQueue() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyQueue queue = new MyQueue();
		queue.enqueue(myThirdNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myFirstNode);
		INode node = queue.dequeue();
		queue.displayQueue();
		Assert.assertEquals(mySecondNode, node);
	}
}
