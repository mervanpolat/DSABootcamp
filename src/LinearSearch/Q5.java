package LinearSearch;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        //Q5: Find the maximum number in a 2D array

        int[][]arr = {
                {1,2,4,6},
                {45,42,3,5},
                {3,42,99,6,7,8}
        };

        print(arr);
        //[1, 2, 4, 6]
        //[45, 42, 3, 5]
        //[3, 42, 5, 6, 7, 8]
        System.out.println(max(arr));   //45
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    static void print(int[][]arr) {
        for(int[]subarray : arr) {
            System.out.println(Arrays.toString(subarray));
        }
        System.out.println();
    }
}
