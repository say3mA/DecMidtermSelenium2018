package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 * 
		 */
		
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		List<String> a = new ArrayList<String>();
		a.add("hi");
		a.add("hello");
		a.add("hello there");
		list.put("key", a);
		Iterator<Entry<String, List<String>>> iterator = (Iterator<Entry<String, List<String>>>) list.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<String, List<String>> etnry = iterator.next();
			System.out.println("Key: " + etnry.getKey());
			System.out.println("Value: "+ etnry.getValue());
			
			
		}
		for(List<String> entry : list.values()) {
			System.out.println(entry);
		}
		
	}

}
