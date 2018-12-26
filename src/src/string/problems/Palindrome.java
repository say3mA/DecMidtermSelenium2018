package src.string.problems;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
    	System.out.println(isPalindrome("madam"));
    	System.out.println(isPaldindrometwo("madam"));

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
    public static boolean isPaldindrometwo(String s) {
    	Stack<Character> a = new Stack<Character>();
    	for(int i = 0; i < s.length(); i++) {
    		a.push(s.charAt(i));
    	}
    	String st = "";
    	while(!a.isEmpty()) {
    	st += a.pop();
    	}
    	if(s.equals(st))
    	
    	
    	
    	return true;
    	else
    		return false;
    	
    }
}
