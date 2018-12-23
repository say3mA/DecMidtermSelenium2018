package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */


    }
    public static boolean isPalindrome(String s){
        String a = "";
        for(int i = s.length()-1; i >=0; i--){
            a = a + s.charAt(i);
        }
        if(s.equals(a)){
            return true;

        }
        else return false;
    }
}
