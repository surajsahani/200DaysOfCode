package JavaEssentialTraining;

import java.util.HashMap;
import java.util.Map;

public class HashmapUnordered {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);
		
		map.put("Alaska", "Juneau");
		System.out.println(map);
		System.out.println(map);
		
		String cap = map.get("Oregon");
		System.out.println("The capitol of Orefon is " + cap);
		
		map.remove("California");
	}

}
