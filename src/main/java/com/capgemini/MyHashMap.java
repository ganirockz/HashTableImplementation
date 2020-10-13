package com.capgemini;

public class MyHashMap<K, V> {
	MyLinkedList<K> myLinkedList;

	public MyHashMap() {
		myLinkedList = new MyLinkedList<>();
	}

	public V get(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(K word, V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(word);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<K, V>(word, value);
			this.myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "MyHashMapNodes{" + myLinkedList + "}";
	}
}
