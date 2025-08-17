public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};  // Example input

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate number: " + arr[i]);
                    return; // Exit after finding duplicate
                }
            }
        }
    }
}









Problem : Find the Duplicate Number
You are given an array arr containing n+1 integers, where each integer is in the range [1, n] inclusive. There is exactly one duplicate number in the array, but it may appear more than once. Your task is to find the duplicate number without modifying the array and using constant extra space.

Input :
An integer array arr of size n+1, where each element is an integer in the range [1, n].
Example : arr = [3, 1, 3, 4, 2]

Output :
Return the duplicate integer present in the array.
Example: Duplicate number: 3
