//lex_auth_012899606137856000130
//do not modify the above line

package mergesortexercise1;

public class Tester {

	public static void mergeSort(int[] elements, int size) {
		// Implement your logic here
	}

	public static void merge(int[] elements, int[] left, int[] right, int leftMerge, int rightMerge) {
		// Implement your logic here
	}

	public static void displayArray(int[] elements) {
		for (int element : elements)
			System.out.print(element + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] elements = { 95, 56, 20, 98, 34, 77, 80 };

		System.out.println("Given Array:");
		displayArray(elements);

		mergeSort(elements, elements.length);

		System.out.println("Sorted Array:");
		displayArray(elements);

	}

}
