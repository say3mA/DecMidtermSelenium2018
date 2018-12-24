package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(5);
		q.add(3);
		q.add(1);
        for(Integer a : q){
            System.out.println(a);
        }
        q.peek();
        q.poll();
        q.remove();
        Iterator<Integer> t = q.iterator();
		while(t.hasNext()){
		    System.out.println(t.next());
        }



	}

}
