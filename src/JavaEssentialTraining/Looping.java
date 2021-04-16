package JavaEssentialTraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Looping {

	public static void main(String[] args) {
		
		System.out.println("Order data");
		List<String> list = new ArrayList<>();
		list.add("California");
		list.add("Oregon");
		list.add("Washington");
		
		System.out.println("toString() output");
		System.out.println(list);
		System.out.println("");
		
		System.out.println("ArrayList iterator");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			for (String value : list) {
				System.out.println(value);
			}
		System.out.println("");
		
		System.out.println("ArrayList forEach");
		for (String value : list) {
			System.out.println(value);
		}
		System.out.println("");
		
		System.out.println("Java 8 method referance");
		list.forEach(System.out::println);
		System.out.println("");
		
		System.out.println("Unordered data");
		Map<String, String> map = new HashMap<String, String>();
		map.put("California", "Sacrento");
		map.put("Oregon", "Salem");
		map.put("Washington", "Olympia");
		System.out.println(map);
		System.out.println("");
		
		System.out.println("HashMap Iterator");
		Set<String> keys = map.keySet();
		Iterator<String> iterator1 = keys.iterator();
		while (iterator1.hasNext()) {
			String key = iterator1.next();
			System.out.println("The capitol of " + key + map.get(key));
		}
		System.out.println("");
		
		System.out.println("Hashing ForEach");
		for (String key : keys) {
			System.out.println("The capitol of " + key + map.get(key));
		}
		System.out.println("");
	    }
	}
}
