package MainTest;

import java.util.LinkedList;
import java.util.List;

import datastructure.LinkedListOfInteger;

public class MainDataStructure {

	public static void main(String[] args) {

		// Test the LinkedList Data Structure
		linkedList_test();

	}

	private static void linkedList_test() {
		// Create a LinkedList based on the JDK 1.8 Collection interface
		List<Integer> integerList = new LinkedList<Integer>();
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);
		integerList.get(1);
		System.out.println(integerList.get(0));
		
		// Create a user-defined LinkedList (Integer)
		LinkedListOfInteger integerList2 = new LinkedListOfInteger();

		integerList2.enqueue(6);
		integerList2.enqueue(7);
		integerList2.enqueue(8);

		System.out.println(integerList2.get(1));

	}

}
