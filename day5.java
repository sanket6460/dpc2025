public class LeadersInArray {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        System.out.print("Leaders: ");
        
        // Start from the rightmost element
        int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight + " "); // last element is always a leader

        // Traverse array from second last to first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}




Problem : Find the Leaders in an Array
You are given an integer array arr of size n. An element is considered a leader if it is greater than all the elements to its right. Your task is to find all such leader elements in the array.

Input :
An integer array arr of size n.
Example : 
arr = [16, 17, 4, 3, 5, 2]

Output :
Return an array containing all the leader elements in the order in which they appear in the original array.
Example:
Leaders: [17, 5, 2]




