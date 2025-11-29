package Arrays;

import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        int[]arr = {1,3,33,13,43,4};
        System.out.println(Arrays.toString(arr));   // [1, 3, 33, 13, 43, 4]

        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));   // [33, 3, 1, 13, 43, 4]

        System.out.println(maximumValue(arr));      // 43
        System.out.println(maximumInRange(arr,0,2));    //33

        //Two pointer method
        reverse(arr);                               // [4, 43, 13, 1, 3, 33]
    }

    //Q1: Swapping values in an array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Q2: Maximum value in an array
    static int maximumValue(int[]arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //Q3: Maximum value in range
    static int maximumInRange(int[]arr, int start, int end){
        if (end < start) return -1;
        if (arr == null || arr.length == 0) return -1;

        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //Q4: Reversing an array
    static void reverse(int[]arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
