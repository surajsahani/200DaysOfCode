package ScalerAcademyEntranceQuiz;

public class comprehension {

	static int printlTribeRec(int n) {
		if (n ==0 || n ==1 || n==2)
			return 0;
		
		if (n == 3)
			return 1
			else 
				return printTribeRE(n - 1) +
						printTribeRec(n -2) +
						printTribeRec(n - 3)''
	}
	
	static void printTrib(int n) {
		for (int i =1; i<n; i++)
			System.out.println(printTribeRec(i)+"");
	}
}
