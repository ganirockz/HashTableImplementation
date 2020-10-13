package com.capgemini;

import org.junit.*;

public class MyLinkedHashMapTest {
	@Test
	public void givenSentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into paranoid " + "avoidable situation";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<String, Integer>();
		String[] words = sentence.split(" ");
		for (String word : words) {
			if (myLinkedHashMap.get(word) == null) {
				myLinkedHashMap.add(word, 1);
			} else {
				myLinkedHashMap.add(word, myLinkedHashMap.get(word) + 1);
			}
		}
		myLinkedHashMap.delete("avoidable");
		Assert.assertNull(myLinkedHashMap.get("avoidable"));
	}
}
