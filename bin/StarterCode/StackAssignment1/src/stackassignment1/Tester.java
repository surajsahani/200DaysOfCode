//lex_auth_012887123561635840652
//do not modify the above line

package stackassignment1;

public class Tester {
	public static void main(String args[]) {
        
        Stack stack = new Stack(10);
        stack.push(15);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        calculateSum(stack);
            
        System.out.println("Updated stack");
        stack.display();
    }

    public static void calculateSum(Stack stack) {
        //Implement your code here
    }
}
