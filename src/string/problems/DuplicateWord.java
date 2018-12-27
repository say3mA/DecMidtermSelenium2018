package string.problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int n = st.length();
        int sum = 0;


        String[] a = st.split(" ");
        for(int i = 0; i < a.length; i++){
            sum+=a[i].length();



        }

        System.out.println("avg length of words: " + sum/a.length);
        List<String> list = Arrays.asList(st.split(" "));
        Set<String> set = new HashSet<String>(list);
        for(String word : set){
            System.out.println(word + ": " + Collections.frequency(list, word));
        }



        }
    }


