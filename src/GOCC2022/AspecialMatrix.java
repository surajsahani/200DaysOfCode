package GOCC2022;

/*Google Internship 2020 – Google Online Challenge(1st Coding Round) 
 * You are given an N × N matrix A. The matrix consists of positive integers. In one move, you can apply the following single transformation to the matrix:

Select an arbitrary element of the matrix and increase or decrease it by 1. Each element can be increased or decreased for any arbitrary number of times.

A special number P is a non-negative integer for which the following quadratic equation has at least one negative integer root:

X2 - 2 × P + x = 0
A matrix is called special if at least one of the following conditions is true:




The matrix has a row with special numbers only.
The matrix has a column with special numbers only.
Your task is to count the minimum number of moves required to get special matrix A

Input format

The first line contains T denoting the number of test cases.
The first line of each test case contains an integer N denoting the number of rows and columns.
Next N lines of each test case contain N integers denoting the initial matrix A.
Output format

For each test case, print a single integer in a new line denoting the minimum number of moves required to get a special matrix from the provided matrix. if you have already obtained a special matrix, then print 0.

Constraints:

1 ≤ T ≤ 10
1 ≤ N ≤ 500  
1 ≤ A[i][j] ≤ 1011(1 ≤ i ≤ N, 1 ≤ j ≤ N)
Sample input:

1
3
1 2 3
4 5 6
7 8 9
Sample output:

1
Explanation: Either the first row or third column can be modified to convert the matrix into a special matrix with a minimum number of moves. The first row can be transformed into [1,3,3] by increasing one time the second element of the first row.
 */
public class AspecialMatrix {

}
