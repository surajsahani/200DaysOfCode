package JavaEssentialTraining;

import java.util.Scanner;

public class ComplexCalci {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numeric value: ");
		String input = sc.next();
		double d1 = Double.parseDouble(input);
		System.out.println("Enter a numeric value: ");
		String inputtwo = sc.next();
		double d2 = Double.parseDouble(inputtwo);
		System.out.println("Choose an operation (+, -, *, /)");
		String inputthree = sc.next();
				
		try {
			
			switch (inputthree) {
			case "+":
				double result = d1 + d2;
				System.out.println("The addition of number is " + result);
				break;
			case "-":
				double resultminus = d1 - d2;
				System.out.println("The subtraction of number is " + resultminus);
				break;
			case "*":
				double resultmultiply = d1 * d2;
				System.out.println("The multiplication of number is " + resultmultiply);
				break;
			case "/":
				double resultmodule = d1 / d2;
				System.out.println("The division of number is " + resultmodule);
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
