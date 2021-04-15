package JavaEssentialTraining;

import java.util.Scanner;

public class switchstatement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		String input = sc.next();
		int monthNumber = Integer.parseInt(input);
		
		switch (monthNumber) {
		case 1:
			System.out.println("The month is January");
			break;
		case 2:
			System.out.println("The month is Februray");
			break;
		case 3:
			System.out.println("The month is March");
			break;
		default:
				System.out.println("Your chose another month!");
		}
	}
}
