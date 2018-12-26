package math.problems;

import org.testng.Assert;

import static math.problems.Fibonacci.fibonacci;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        int fibTest = fibonacci(6);
        Assert.assertEquals(13, fibTest);

    }
}
