package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static int factorial(int n) {
        if (n == 1) return 1;
        else return n * factorial(n - 1);

    }

    public static int factorialIteration(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        final int result1 = result;
        return result1;
    }

        public static void main (String[]args){
            /*
             * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
             * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
             *
             */



            System.out.println(factorial(5));
            System.out.println(factorialIteration(5));

        }
    }


