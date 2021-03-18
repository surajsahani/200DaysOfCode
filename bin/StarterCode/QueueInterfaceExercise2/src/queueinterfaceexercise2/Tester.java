//lex_auth_012990552204369920227
//do not modify the above line

package queueinterfaceexercise2;

import java.util.Deque;
import java.util.ArrayDeque;

public class Tester {
	
	public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
		
		//Implement your logic here and change the return statement accordingly
		return null; 
	}

	public static void main(String[] args) {
		
		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(10);
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(12);
		inputStack.push(5);
		
		Deque<Integer> updatedStack = changeSmallest(inputStack);
		
		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}