package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        


        String st = "";
        //implement
        int max = 0;



            	for(Map.Entry<Integer, String> entry : map.entrySet()){
            			int key = 0;

            			String value = entry.getValue();
            			key = value.length();
            			map.put(key, value);


            		}
            	for(Map.Entry<Integer, String> e : map.entrySet()){
            	    st = e.getValue();
            	    int key = st.length()


                }

        return map;
    }
}
