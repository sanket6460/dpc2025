public class ZeroSumSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        int n = arr.length;

        System.out.println("Subarrays with sum 0:");

        // Check all subarrays
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum == 0) {
                    System.out.println("(" + start + ", " + end + ")");
                }
            }
        }
    }
}




Problem : Find All Subarrays with Zero Sum
You are given an integer array arr of size n. Your task is to find all the subarrays whose elements sum up to zero. A subarray is defined as a contiguous part of the array, and you must return the starting and ending indices of each subarray.

Input :
An integer array arr of size n where n represents the number of elements in the array.
Example : 
Input: [1, 2, -3, 3, -1, 2]

Output :
- Return a list of tuples, where each tuple contains two integers. The starting index (0-based) of the subarray. The ending index (0-based) of the subarray.
- The output should list all subarrays that sum to zero. If no such subarrays are found, return an empty list.
Example
Output: [(0, 2), (1, 3)]
