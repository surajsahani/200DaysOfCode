//lex_auth_012954798691950592884
//do not modify the above line

package dynamicprogrammingassignment1;

import java.util.ArrayList;
import java.util.List;

public class Tester {
	static int count = 0;
    
	public static void findWordSegments(List<String> wordsList, String inputString) {
       //Implement your logic here
	}

	public static void main(String[] args){
	    List<String> wordsList = new ArrayList<String>();
	    wordsList.add("i");
	    wordsList.add("like");
	    wordsList.add("pizza");
	    wordsList.add("li");
	    wordsList.add("ke");
	    wordsList.add("pi");
	    wordsList.add("zza");

		String inputString = "ilikepizza";
		findWordSegments(wordsList, inputString);
		System.out.println("Number of segments: "+count);
	}
}
