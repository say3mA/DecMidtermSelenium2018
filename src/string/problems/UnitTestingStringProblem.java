package string.problems;

import org.testng.Assert;

import static string.problems.Palindrome.isPalindrome;
import static string.problems.Palindrome.isPalindrometwo;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        String palindrome = "madam";
        Assert.assertEquals(true, isPalindrome(palindrome));
        Assert.assertEquals(true, isPalindrometwo(palindrome));
    }
}
