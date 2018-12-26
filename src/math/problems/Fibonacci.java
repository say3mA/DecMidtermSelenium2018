package math.problems;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n<=1){
            return 1;
        }

        else
            return fibonacci(n-1)+fibonacci(n-2);
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
