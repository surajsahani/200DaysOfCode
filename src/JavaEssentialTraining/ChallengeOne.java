package JavaEssentialTraining;

import java.util.Scanner;

public class ChallengeOne {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a numeric value:");
		String input = scanner.next();
		double d1 = Double.parseDouble(input);
		System.out.println("Enter a numeric value:");
		String inputwo = scanner.next();
		double d2 = Double.parseDouble(inputwo);
		
		double result = d1 + d2;
		
		System.out.println("The answer is " + result);
	}
}
