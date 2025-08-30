public class LCMCalculator {
    // Function to find GCD using Euclidean Algorithm
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find LCM
    static long lcm(int a, int b) {
        return ((long) a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int N = 4, M = 6;
        System.out.println("LCM of " + N + " and " + M + " is: " + lcm(N, M));
    }
}




Problem : LCM (Least Common Multiple) of Two Numbers
You are given two integers, N and M. Your task is to find the Least Common Multiple (LCM) of these two numbers. The LCM of two integers is the smallest positive integer that is divisible by both N and M.

Input :
* Two integers N and M, where 1≤N,M≤109
* N = 4, M = 6

Output :
A single integer representing the Least Common Multiple of N and M.
Output: 12
