package LinearSearch;

import java.util.Arrays;
import java.util.Random;

public class Syntax {
    public static void main(String[] args) {
        int target = 19;
        int[]arr = new int[10];

        fillArray(arr);

        System.out.println(target);
        System.out.println(linearSearch(arr,target));
    }

    static boolean linearSearch(int[]arr, int element) {
        if (arr.length == 0) return false;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == element) {
                return true;
            }
        }
        return false;
    }

    static void fillArray(int[] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100 + 1);
        }
        System.out.println(Arrays.toString(arr));
    }
}
