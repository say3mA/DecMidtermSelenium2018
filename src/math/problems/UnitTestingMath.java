package math.problems;

import org.testng.Assert;

import static math.problems.Factorial.factorial;
import static math.problems.Fibonacci.fibonacci;
import static math.problems.FindMissingNumber.findMissin;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        int fibTest = fibonacci(6);
        Assert.assertEquals(13, fibTest);
        int facTest = factorial(5);
        Assert.assertEquals(120, facTest);
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        Assert.assertEquals(9, findMissin(array));

    }
}
