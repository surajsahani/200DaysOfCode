package learning_java;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
	Traingle traingleA = new Traingle(15,8,15,8,17);
	Traingle traingleB = new Traingle(3,2.589,3,3,3);
	
	double traingleAArea = traingleA.findArea();
	System.out.println(traingleAArea);
	
	double traingleBArea = traingleB.findArea();
	System.out.println(traingleBArea);
	
	System.out.println(traingleA.sideLenThree);
	System.out.println(traingleB.base);
	
	System.out.println(Traingle.numOfSide);
	}
}
 