//lex_auth_012990565548072960228
//do not modify the above line

package queueinterfaceexercise1;

import java.util.Deque;
import java.util.ArrayDeque;

public class Tester {
	
	public static Deque<Object> mergeQueue(Deque<Integer> intQueue, Deque<Character> charQueue) {
		
		//Implement your logic here and change the return statement accordingly 
		return null;
	}

	public static void main(String[] args) {
		
		Deque<Integer> integerQueue = new ArrayDeque<Integer>();
		integerQueue.add(3);
		integerQueue.add(6);
		integerQueue.add(9);
		
		Deque<Character> characterQueue = new ArrayDeque<Character>();
		characterQueue.add('a');
		characterQueue.add('e');
		characterQueue.add('i');
		characterQueue.add('o');
		characterQueue.add('u');
		characterQueue.add('b');

		Deque<Object> mergedQueue = mergeQueue(integerQueue, characterQueue);
		
		System.out.println("The elements in the merged queue are:");
		for(Object element: mergedQueue)
		    System.out.println(element);
	}
}