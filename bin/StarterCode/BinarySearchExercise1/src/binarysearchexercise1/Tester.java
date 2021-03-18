//lex_auth_01289490689703936088
//do not modify the above line

package binarysearchexercise1;

public class Tester {
	public static int iterations=0;
	
	public static int searchElement(int elements[],int low,int high,int elementToBeSearched)  {
		//Implement your logic here and change the return statement accordingly
		return 0;
	}
	
	public static void main(String[] args) {
	    int[] elements = { 1, 23, 43, 46, 78, 90 };
		int elementToBeSearched = 43;
		
		int indexPosition=searchElement(elements, 0, elements.length-1, elementToBeSearched);
		
		if (indexPosition == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found at index position " + indexPosition+"!");
		
		System.out.println("Number of iterations: "+iterations);
	}
}
