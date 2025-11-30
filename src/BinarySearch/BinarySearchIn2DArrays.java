package BinarySearch;

import java.util.Arrays;

public class BinarySearchIn2DArrays {
    public static void main(String[] args) {
        int[][]arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(binarySearch(arr, 49))); // [2, 3]
    }

    // This method searches for a target number inside a 2D array (matrix)
    // It returns the row and column where the number is found
    // If the number is not found, it returns {-1, -1}

    static int[] binarySearch(int[][] matrix, int target) {
        // Start at the top-right corner of the matrix
        int row = 0;
        int col = matrix.length - 1;

        // Continue searching while we are inside the matrix
        while (row < matrix.length && col >= 0) {

            // Check if the current element matches the target
            if (matrix[row][col] == target) return new int[]{row, col};  // Found → return position

            // If the current element is smaller than target,
            // move down to the next row (bigger numbers)
            if (matrix[row][col] < target) {
                row++;
            } else {
                // If the current element is larger than target,
                // move left to the previous column (smaller numbers)
                col--;
            }
        }
        // Target not found → return {-1, -1}
        return new int[]{-1, -1};
    }

}
