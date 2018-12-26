package datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		LinkedList<String> list = new LinkedList<String>();
		Stack<String> stack = new Stack<String>();
		try (BufferedReader br = new BufferedReader(new FileReader("/Users/MacUser/eclipse-workspace/midtermSeleniumDec2018/src/data/self-driving-car"))) {
			while(br.ready()){
				String s = br.readLine();
				System.out.print(s);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		try (BufferedReader br = new BufferedReader(new FileReader("/Users/MacUser/eclipse-workspace/midtermSeleniumDec2018/src/data/self-driving-car"))) {
			while(br.ready()){
				String s = br.readLine();

				list.add(s);

				stack.push(s);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		for(String a : list){
			System.out.println(a);

		}
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		String reverse = "";
		while(!stack.isEmpty()){
			reverse += stack.pop();
			System.out.println(stack.pop());

		}
		System.out.println(reverse);



	}

}
