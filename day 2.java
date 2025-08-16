public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};  // Example input
        int n = arr.length + 1;    // One number missing

        int total = n * (n + 1) / 2; // Sum of 1..n
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];   // adding array elements
        }

        int missing = total - sum;
        System.out.println("Missing number: " + missing);
    }
}




Problem : Find the Missing Number
You are given an array arr containing n-1 distinct integers. The array consists of integers taken from the range 1 to n, meaning one integer is missing from this sequence. Your task is to find the missing integer.

Input :
An integer array arr of size n-1 where the elements are distinct and taken from the range 1 to n.
Example : arr = [1, 2, 4, 5]

Output :
Return the missing integer from the array.
Example: Missing number: 3
