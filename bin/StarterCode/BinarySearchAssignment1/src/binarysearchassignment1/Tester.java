//lex_auth_0129590781838786561535
//do not modify the above line

package binarysearchassignment1;

public class Tester {

    public static int searchCustomerId(int customerIds[], int customerIdToBeSearched) {
		//Implement your logic here and change the return statement accordingly
		return 0;
	}
	
	public static void main(String[] args) {
		int[] customerIds = { 80451, 80462, 80465, 80479, 80550, 80561, 80665, 80770 };
		int customerIdToBeSearched = 80462;

		int index = searchCustomerId(customerIds, customerIdToBeSearched);
		
		if (index == -1)
			System.out.println("Customer Id " + customerIdToBeSearched + " is not found!");
		else
			System.out.println("Customer Id " + customerIdToBeSearched + " is found at index position " + index+"!");
	}
	

}