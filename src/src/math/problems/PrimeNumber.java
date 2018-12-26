package src.math.problems;

import java.util.LinkedList;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 2; i < 1000000; i++) {
			if(isPrime(i)) System.out.println(i);
		}

	}

	public static boolean isPrime(int candidate) {
        // All even numbers except 2 are not primes.
        if ((candidate & 1) == 0) {
            if (candidate == 2) { // Two is prime.
                return true;
            } else {
                return false;
            }
        }
        // Search for prime numbers of the candidate.
        // ... Primes are odd, smaller than the candidate.
        // ... And a modulo division returns 0.
        for (int i = 3; (i * i) <= candidate; i += 2) {
            if ((candidate % i) == 0) {
                return false;
            }
        }
        return candidate != 1;
    }
}

