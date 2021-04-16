package GOCC2022;

/*
 * Size of the smallest subset with maximum Bitwise OR
 * 
 * Given an array of positive integers. The task is to find the size of the smallest subset such that the Bitwise OR of that set is Maximum possible. 

Examples: 

Input : arr[] = {5, 1, 3, 4, 2}
Output : 2
7 is the maximum value possible of OR, 
5|2 = 7 and 5|3 = 7

Input : arr[] = {2, 6, 2, 8, 4, 5}
Output : 3
15 is the maximum value of OR and set
elements are 8, 6, 5 

Doing bitwise OR of a number with some value does not decrease its value.
 It either keeps the value same or increases. If we take a closer look 
 at the problem we can notice that the maximum OR value that we can get 
 is by doing bitwise OR of all array elements. But this includes all 
 elements and here want to know the smallest subset. So we do the following. 
I) Find bitwise OR of all array elements. This is the OR we are looking for. 
II) Now we need to find the smallest subset with this bitwise OR. 
This problem is similar to the subset-sum problem, We can solve it in 
two ways : 

We recursively generate all subsets and return the smallest size with 
given OR
We use Dynamic Programming to solve the problem. This solution is going
 to be very similar to Maximum size subset with given sum
The time complexity of the recursive solution is O(2n) and time 

complexity of the Dynamic Programming solution is O(OR * n) where OR 
is OR of all array elements and n is the size of the input array. 
 

Using Method 1 : (recursively generating all subsets and return the smallest size with given OR) 
 */
public class Bitwise_OR {

	// Compute bitwise or of all elements
	  // in array of size sz
	  private static int OR(int[] arr)
	  {
	    int mOR = 0;
	    for (int i = 0; i < arr.length; ++i)
	    {
	      mOR |= arr[i];
	    }
	    return mOR;
	  }
	   
	  // Recursively calculating the size of
	  // minimum subset with maximum or
	  private static int maxSubset(int[] arr, int i,
	                int curOr, int curSize, int maxOr)
	  {
	       
	    // If i is arr.length
	    if (i == arr.length)
	    {
	       
	      // If curOr is equal to maxOr
	      if (curOr == maxOr)
	      {
	          return curSize;
	      }
	       
	      // Return arr.length
	      else
	      {
	          return arr.length;
	      }
	    }
	     
	    // Try the current element in the subset
	    int take = maxSubset(arr, i + 1, curOr |
	                          arr[i], curSize + 1, maxOr);
	     
	    // Skip the current element
	    int notTake = maxSubset(arr, i + 1, curOr,
	                                      curSize, maxOr);
	     
	     
	    // Return minimum of take and notTake
	    return Math.min(take, notTake);
	  }
	   
	  // Driver Code
	  public static void main(String[] args)
	  {
	    int[] data = {5, 1, 3, 4, 2};
	     
	    int maxOr = OR(data);
	     
	    // Function Call
	    int maxSubsetSize = maxSubset(data, 0, 0, 0, maxOr);
	    System.out.println(maxSubsetSize);
	  }
}
