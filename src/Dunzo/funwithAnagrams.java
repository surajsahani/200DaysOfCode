package Dunzo;
import java.io.FileNotFoundException;
import java.util.*;

public class funwithAnagrams {

	public static boolean areAnagram(String W1, String W2) {
		char[]  chr1 = W1.toCharArray();
		char[]  chr2 = W2.toCharArray();
		
		// Sorting the two arrrays and checking for equality also works but this is faster.
		
		int[] count = new int[26];
		for(char ch:chr1) {
			count[ch-97] = count[ch-97]+1;
		}
		for(char ch:chr2) {
			count[ch-97] = count[ch-97]-1;
		}
		for(int n:count) {
			if (n!=0) {
				return false;
				
			}
		}
		return true;
	}
	public static String key(String word) {
		char[] chrs = word.toCharArray();
		Arrays.sort(chrs);
		return new String(chrs);
	}
	public static List<String> funWithAnagrams(List<String> s) {
		List<String> ans = new LinkedList<String>();
		Set<String> found = new HashSet<String>();
		for (int i =0; i<s.size(); i++) {
			String word= s.get(i);
			String key = key (word);
			if(!found.contains(key)) {
				ans.add(word);
				found.add(key);
			}
		}
		
		Collections.sort(ans);
		
		return ans;
	}
	public static void main(String [] args) throws FileNotFoundException {
		// List<string> a = Arrays.asList("code","doce","framer","frame");
		List<String> a = Arrays.asList("code","aaagmnrs","anagrams","doce");
		System.out.println(funWithAnagrams(a));
			}
}
