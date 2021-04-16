package GOCC2022;

/*Google Internship 2020 – Google Online Challenge(1st Coding Round)
 * A Special String: You Are given a string S consisting of the lowercase Latin alphabet, a – z. Find the minimum number of characters that must be changed to make S special.

A string S is said to be special if and only if for all (S[i], S[j]) where (1 ≤  i ≤ N/2) and (N/2 + 1 ≤ j ≤ N) one of the following condition is true:

S[i] > S[j]
S[i] < S[j]
S[i] = S[j]
S[i]: Represents the ith character of string S(1-based indexing)
Input format:

The first line contains an integer T denoting the number of test cases
The first line of each case contains an integer N denoting the length of S
The second line of each test case contains a string S
Output format: Print an integer denoting the minimum number of changes required for each test case in a new line.




Constraints:

1 ≤ T ≤ 5
1 ≤ N ≤ 103
N is Even
Sample input:

1
6
aababc
Sample output:

2
Explanation:

Change S[4] = ‘d’(1 – based indexing)
Change S[5] = ‘d’
New String  = ‘aabddc’
Now all Pairs (S[i],S[j]) 
Satisfy the second condition, S[i] < S[j].
 */
public class AspecialString {

}
