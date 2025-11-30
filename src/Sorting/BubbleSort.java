package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = {34,45,6,8,4,34,45,6};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
    }

    // This method sorts an array in ascending order using Bubble Sort.
    // Bubble Sort compares neighboring elements and swaps them if they are in the wrong order.
    static void bubbleSort(int[] arr) {
        boolean swapped; // Tracks if a swap happened in the inner loop

        // Outer loop: Runs n times at most
        for (int i = 0; i < arr.length; i++) {
            swapped = false; // Reset swap flag for each new pass through the array
            // Inner loop: Compare each pair of neighbors
            // We stop at (arr.length - i - 1) because the last i elements are already sorted
            for (int j = 1; j < arr.length - i; j++) {

                // If the current element is smaller than the previous one → wrong order → swap
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true; // A swap happened this pass
                }
            }

            // If no swaps happened in this pass, the array is already sorted → stop early
            if (!swapped) {
                break;
            }
        }
        // Print the array after sorting
        System.out.println(Arrays.toString(arr));
    }
    // Helper method: swaps two elements in the array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
