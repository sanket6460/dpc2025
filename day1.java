public class Sort012ForLoop {
    public static void sortArray(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

    // First pass: count the number of 0s, 1s, and 2s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // Second pass: overwrite array
        int index = 0;
        for (int i = 0; i < count0; i++) {
            arr[index++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            arr[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            arr[index++] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sortArray(arr);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
