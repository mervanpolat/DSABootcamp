package BinarySearch;

public class BinarySearchInSortedMatrix {
    public static void main(String[] args) {

    }

    // Binary search in a single row between two column indices
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid}; // Found
            }

            // Go right (bigger values)
            if (matrix[row][mid] < target) {
                colStart = mid + 1;
            }
            // Go left (smaller values)
            else {
                colEnd = mid - 1;
            }
        }

        return new int[]{-1, -1}; // Not found
    }

    // Main search method for a sorted 2D matrix
    static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length; // NOTE: Works only if matrix has at least 1 column

        // Special case: Only one row → do a simple binary search
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        // Search in the middle column
        int rowStart = 0;
        int rowEnd = rows - 1;
        int midColumn = cols / 2;

        // Narrow down to two rows
        while (rowStart < (rowEnd - 1)) {
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[mid][midColumn] == target) {
                return new int[]{mid, midColumn}; // Found
            }

            if (matrix[mid][midColumn] < target) {
                rowStart = mid; // Search below (larger values)
            } else {
                rowEnd = mid;   // Search above (smaller values)
            }
        }

        // Now we only have 2 rows left: rowStart and rowStart + 1

        // Check the middle column elements in both remaining rows
        if (matrix[rowStart][midColumn] == target) {
            return new int[]{rowStart, midColumn};
        }
        if (matrix[rowStart + 1][midColumn] == target) {
            return new int[]{rowStart + 1, midColumn};
        }

        // Check the 4 halves (quadrants)

        // 1️⃣ Top left part
        if (target <= matrix[rowStart][midColumn - 1]) {
            return binarySearch(matrix, rowStart, 0, midColumn - 1, target);
        }
        // 2️⃣ Top right part
        if (target >= matrix[rowStart][midColumn + 1] && target <= matrix[rowStart][cols - 1]) {
            return binarySearch(matrix, rowStart, midColumn + 1, cols - 1, target);
        }
        // 3️⃣ Bottom left part
        if (target <= matrix[rowStart + 1][midColumn - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, midColumn - 1, target);
        }
        // 4️⃣ Bottom right part
        return binarySearch(matrix, rowStart + 1, midColumn + 1, cols - 1, target);
    }
}