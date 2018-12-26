package src.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			Random rand = new Random();
			int c = rand.nextInt(5000);
			list.add(c);
		}
		
		for(int a : list) {
			System.out.println(a);
			
			
		}
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	

	}

}
