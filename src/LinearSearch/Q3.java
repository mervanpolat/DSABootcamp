package LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        //Q3: Find minimum number in an array
        int[]arr = new int[10];
        fillArray(arr);
        System.out.println(Arrays.toString(arr));
        findMinElement(arr);
    }

    static void fillArray(int[] arr){
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50+1);
        }
    }

    static void findMinElement(int[]arr) {
        int min = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < min) min = j;
        }
        System.out.println(min);
    }
}
