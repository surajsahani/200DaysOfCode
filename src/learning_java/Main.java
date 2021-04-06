package learning_java;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
		StudentProfile profileOne = new StudentProfile("Sally","Salmon", "Film", 3.75, 2022);
		StudentProfile profileTwo = new StudentProfile("Max","Tiffen", "Computer Science", 3.45, 2021);

		profileTwo.increamentExpectedGraduateYear();
		System.out.println(profileTwo.expectedYearToGraduate);
	}
}
 