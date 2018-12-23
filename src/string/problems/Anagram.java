package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String a = "bob";
        String b = "obb";
        System.out.println(isAnagram(a, b));
    }



    public static boolean isAnagram(String s, String t){
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        if(s.length() != t.length()){
            return false;

        }
        Arrays.sort(sc);
        Arrays.sort(tc);

        if(Arrays.equals(sc, tc)){
            return true;
        }
        else
            return false;


    }

}
