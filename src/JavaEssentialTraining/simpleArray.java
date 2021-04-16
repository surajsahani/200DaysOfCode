package JavaEssentialTraining;

import java.util.Arrays;

public class simpleArray {
	
	public static void main(String[] args) {
		
		System.out.println("Arrays of primitivies");
		int[] ints = {3,6,9};
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		
		System.out.println("Arrays of strings");
		String[] strings = {"Red, Green, Blue"};
		Arrays.sort(strings);
		for (String color : strings) {
			System.out.println(color);
		}
		System.out.println("Setting an initial size");
		int[] sized = new int[10];
		for (int i = 0; i < sized.length; i++) {
			sized[i] = i * 100;
		}
		
		System.out.println("Copying an array");
		int[] copied = new int[5];
		System.arraycopy(sized, 5, copied , 0 , 5);
		for (int value : copied) {
			System.out.println(value);
		}
	}
}
