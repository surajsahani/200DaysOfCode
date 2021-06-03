/*
 * Simple decryption
 * 
 * Text encryption/decryption is used to 
 * securely transfer dat between two 
 * parties. A system uses  a simple
 * encryption method to encrypt text 
 * messages using a key. This encrypted
 * text is called a cipher text. We have 
 * Received a collection of such cipher texts 
 * and the key that was used to encrypted them.
 * 
 * 
 * The original text message can be 
 * obtained by decrypting the cipher text using the decryption algoritham as 
 * follows:
 * - The given key has be a non-zero number 
 * less than the length of the given cipher text
 * - The original message is just a 
 * rearrangement of the cipher text message.
 * - To find the nth character in the original message, find the (n+k)th
 * character in the cipher text, where k is given key
 * - If the value of n+k becomes greater 
 * than the length of the message itself 
 * (for e.g. this can happen when finding 
 * the last character) then cycle back to the beginning of the message and
 * continue from there (refer example
 * below for demonstration)
 * 
 * Given the cipher text and the key used,
 * the program should print the original 
 * text message
 * 
 * Example 
 * Consider the following input:
 * applepine
 * 5
 * 
 * Here applepine is the cipher text and 5 
 * is the key to be used to decrypt it. The 
 * original text message would then be decrypted as below:
 * 
 *  Key is 5, which is non-zero and also less
 *  than the length of the cipher text.
 *  
 *  We use the logic:nth character of 
 *  original message -> n+k th character of 
 *  cipher text where k is give (5 in this example)
 *  
 *  1st character of original text is, 1+5 = 6th character
 *     of cipher text:p
 *  2nd character of the origin is text is, 2+5 = 7th character 
 *    of cipher text:i
 *  3rd character of original  text is , 3+5 = 8th character
 *    of cipher text:n
 *  4th character of original text is, 4+5 =9th character of cipher text:e
 *  5th character of original text is, 5+5 = 10th
 *   character of cipher text,
 *   so we cycle back t othe beginning:A
 *  6th character of original text is, 6+5 = 11th
 *   character of cipher 
 *   text. But 11 is greater than length of the cipher text, 
 *   so we cycle back to the 
 *   beginning:p
 * 7th character of original text is 7+5 =12th
 *   character of cipher text
 *   But 12 is greater than length of the cipher text, so
 *   we cycle back to the beginning:p
 * 8th character of original text
 * is 8 + 5 = 13th
 * character of cipher text. But 13 is greater than length
 * of the cipher text, so we cycle back to the beginning:l
 * 9th character of original  text is, 9+5 = 14th
 * character of cipher text. But 14 is greater than length 
 * of the cipher text, so we cycle back to
 * beginning:e
 * 
 * Combining these letters, we get the original text as: pineapple
 * 
 * Sould there be a constraint violation,
 * then the following output be printed on 
 * the console:
 * Invalid Input
 * 
 * Function Description
 * Complete the function decrytMessage in the editor
 * below. The function should 
 * print the decrypted message.
 * decryptedMessage has the following
 * parameter(S):
 *    cipherText: a String denoting the encrypted message
 *    key: an integer denoting the key to be used for decryption
 *    
 *    Constraints
 *    
 *    The key should be greater than 0
 *    The key should be less than the length the given cipher text
 *    
 *     
 *
 *Input Format For Custom Testing
 *he first line containes the string
 *denoting the cipher text
 *
 *The second line contains an integer 
 *denoting the key for decryption
 *
 *Sample Case 0
 *Sample Input For Custom Testing
 *
 *applepine
 *5
 *
 *Sample Output
 *pipeapple
 *
 *Explanation
 *Given the key 5, the nth character of 
 *the original message is found by finding 
 *the n+5 th character in the cipher text. The count cycles back to 
 *the start of the message if it goes beyond the length of the message.
 *Using this, we get the original message
 *'pipeapple'
 *
 *Sampple Case 1
 *Sample Input For Custom Testing
 * 
 * applepine
 * 11
 * 
 * Sample Output
 * 
 * Invalid Output 
 * Explaination 
 * The given key 11 is greater than the length of the 
 * cipher text. Hence the key is invalid and the output is 
 * invalid input
 *   
 */
public class SimpleDecryption {

}
