//lex_auth_0128962653750804486
//do not modify the above line

package queueassignment1;

public class Tester {
	public static void main(String[] args) {
        
        Queue queue = new Queue(7);
        queue.enqueue(13983);
        queue.enqueue(10080);
        queue.enqueue(7113);
        queue.enqueue(2520);
        queue.enqueue(2500);

        Queue outputQueue = findEvenlyDivisibleNumbers(queue);
            
        System.out.println("Evenly divisible numbers");
        outputQueue.display();

    }
      
    public static Queue findEvenlyDivisibleNumbers(Queue queue) {
    	//Implement your code here and change the return value accordingly
    	return null;   
    }
}
