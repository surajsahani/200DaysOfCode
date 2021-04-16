package GOCC2022;

/*
 * You are given a string of length n (1-based indexing) having only the lowercase english alphabets.You have to answer q queries each consisting of two integers l, r. For each query you have to return the count of all sub-strings in range [l, r] (both l and r inclusive) such that its starting and ending characters are same.




Sample Testcase : aabacc

Queries

2 5

1 2

1 6

Sample Output :

5

3

10

(100 Marks)

Finally 21 Students were selected for the next round.
 */
public class SubsetProble {

	 // Returns size of maximum sized subset if there
    // is a subset of set[] with sun equal to given sum.
    // It returns -1 if there is no subset with given sum.
    static int isSubsetSum(int set[], int n, int sum)
    {
        // The value of subset[i][j] will be true if there
        // is a subset of set[0..j-1] with sum equal to i
        boolean subset[][] = new boolean[sum + 1][n + 1];
        int count[][] = new int[sum + 1][n + 1];
 
        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++) {
            subset[0][i] = true;
            count[0][i] = 0;
        }
 
        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i <= sum; i++) {
            subset[i][0] = false;
            count[i][0] = -1;
        }
 
        // Fill the subset table in bottom up manner
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                count[i][j] = count[i][j - 1];
                if (i >= set[j - 1]) {
                    subset[i][j] = subset[i][j] ||
                       subset[i - set[j - 1]][j - 1];
 
                    if (subset[i][j])
                        count[i][j] = Math.max(count[i][j - 1],
                             count[i - set[j - 1]][j - 1] + 1);
                }
            }
        }
 
        return count[sum][n];
    }
 
    /* Driver program to test above function */
    public static void main(String args[])
    {
        int set[] = { 2, 3, 5, 10 };
        int sum = 20;
        int n = set.length;
        System.out.println(isSubsetSum(set, n, sum));
    }
}
