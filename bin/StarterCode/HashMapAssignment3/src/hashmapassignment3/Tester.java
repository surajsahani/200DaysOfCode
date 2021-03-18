//lex_auth_012891298658484224353
//do not modify the above line

package hashmapassignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Tester{
    
	public static Map<Character, Integer> findOccurrences(String input) {
        //Implement your logic here and change the return statement accordingly
        return null;
	}
	
	public static void main(String args[]) {
		
		String input = "occurrence";
		Map<Character, Integer> occurrenceMap = findOccurrences(input);
		
		System.out.println("Occurrences of characters\n=======================");
		for (Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}