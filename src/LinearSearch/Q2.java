package LinearSearch;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        //Q2: Search in range in an array

        int[]arr = new int[10];
        fillArray(arr);
        int target = 19;

        System.out.println(searchInRange(arr, 0, 3, target));

    }

    static boolean searchInRange(int[]arr, int start, int end, int target){
        if (arr.length == 0) return false;
        if (start > end) return false;

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) return true;
        }
        return false;
    }

    static void fillArray(int[]arr){
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20+1);
        }
    }
}
