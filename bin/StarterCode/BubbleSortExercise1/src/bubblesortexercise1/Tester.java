//lex_auth_01289618234504806414
//do not modify the above line

package bubblesortexercise1;

public class Tester {
	static int noOfSwaps = 0;
	static int noOfPasses = 0;

	public static void swap(int[] elements, int firstIndex, int secondIndex) {
		// Implement your logic here
	}

	public static int bubbleSort(int[] elements) {
		// Implement your logic here and change the return statement accordingly
		return 0;
	}

	public static void displayArray(int[] elements) {
		for (int element : elements)
			System.out.print(element + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int[] elements = { 23, 67, 45, 76, 34, 68, 90 };

		System.out.println("Given array:");
		displayArray(elements);

		int noOfPasses = bubbleSort(elements);

		System.out.println("==========================");
		System.out.println("Total number of passes needed to sort the array: " + noOfPasses);
		System.out.println("==========================");

		System.out.println("Array after sorting:");
		displayArray(elements);

	}
}