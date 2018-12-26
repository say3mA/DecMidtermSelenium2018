package src.math.problems;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else if (n == 0) {return 0;}
        else
            return n+fibonacci(n-1);
    }
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
    	for(int i = 1; i <=40; i++) {
    		System.out.print(fibonacci(i) + " ");
    	}

    }
}
