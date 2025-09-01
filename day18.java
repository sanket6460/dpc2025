import java.util.Scanner;

public class NumberOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int count = 0;

        // Loop till sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                // i is a divisor
                count++;
                
                // if n / i is a different divisor, count it too
                if (i != n / i) {
                    count++;
                }
            }
        }
        
        // Output
        System.out.println("Total number of divisors: " + count);
        
        sc.close();
    }
}


Problem : Count the Number of Divisors of a Number
Given a positive integer N, your task is to find the total number of divisors (factors) of N. A divisor of N is any integer that divides N without leaving a remainder.
A divisor of a number is any integer that divides the number evenly (i.e., without a remainder). For example, for N = 12, its divisors are 1, 2, 3, 4, 6, 12, so the total number of divisors is 6.

Input :
A single integer N, where 1≤N≤109
N = 12

Output :
An integer representing the total number of divisors of N.
Output: 6

