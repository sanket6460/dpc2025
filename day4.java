import java.util.Arrays;

public class MergeSortedArraysSimple {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};
        int m = arr1.length, n = arr2.length;

        for (int i = 0; i < m; i++) {
            if (arr1[i] > arr2[0]) {
                // swap
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // sort arr2 again
                Arrays.sort(arr2);
            }
        }

        System.out.print("arr1 = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        System.out.print("arr2 = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}


Problem : Merge Two Sorted Arrays
You are given two sorted arrays arr1 of size m and arr2 of size n. Your task is to merge these two arrays into a single sorted array without using any extra space (i.e., in-place merging). The elements in arr1 should be merged first, followed by the elements of arr2, resulting in both arrays being sorted after the merge.

Input :
Two sorted integer arrays arr1 of size m and arr2 of size n.
Example : 
arr1 = [1, 3, 5, 7]
arr2 = [2, 4, 6, 8]

Output :
Both arr1 and arr2 should be sorted after the merge. Since you cannot use extra space, the final result will be reflected in arr1 and arr2.
Example:
arr1 = [1, 2, 3, 4]
arr2 = [5, 6, 7, 8]







