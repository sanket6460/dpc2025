import java.util.*;

public class PrimeFactorization {
    public static List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();

        // Divide by 2 until n is odd
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Check for odd factors
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // If n is still greater than 2, then it's prime
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        int N = 18;
        System.out.println("Prime factors of " + N + " : " + primeFactors(N));
    }
}




Problem : Prime Factorization of a Number
Given a positive integer N, your task is to find its prime factorization. Return a list of prime numbers that multiply together to give N. If N is prime, the output should be a list containing only N.
Prime factorization is the process of breaking down a number into the set of prime numbers that, when multiplied together, result in the original number. For example, if N = 18, its prime factors are [2, 3, 3] because 2×3×3=18.

Input :
* A single integer N, where 2≤N≤109
* N = 18

Output :
A list of prime numbers representing the prime factorization of N.
Output: [2, 3, 3]
