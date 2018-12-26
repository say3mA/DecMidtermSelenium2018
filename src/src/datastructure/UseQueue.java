package src.datastructure;
import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;


public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(5);
		queue.add(3);
		queue.add(1);
		Iterator iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println(queue.peek());
		queue.remove();
		queue.peek();
		for(int i : queue) {
			System.out.println(i);
		}
		queue.remove();
		queue.remove();
		queue.poll();
		

	}

}
