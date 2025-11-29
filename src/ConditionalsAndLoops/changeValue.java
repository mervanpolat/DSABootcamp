package ConditionalsAndLoops;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        // Wichtig

        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));   //[1, 2, 3, 4, 5, 6, 7, 8]
        swap(arr);
        System.out.println(Arrays.toString(arr));   //[2, 1, 3, 4, 5, 6, 7, 8]
        System.out.println(Arrays.toString(arr));   //[2, 1, 3, 4, 5, 6, 7, 8]
    }

    static int[] swap(int[]arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        return arr;
    }
}
