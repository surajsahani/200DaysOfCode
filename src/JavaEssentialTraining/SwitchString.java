package JavaEssentialTraining;

import java.util.Scanner;

public class SwitchString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a a string: ");
		String input = sc.next();
		
		switch (input) {
		case "Jan":
			System.out.println("The month is 1");
			break;
		case "Feb":
			System.out.println("The month is 2");
			break;
		case "March":
			System.out.println("The month is 3");
			break;
		default:
				System.out.println("Your chose another month!");
		}
	}
}
