package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rand = new Random(100 + 1);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        for(int element : arr) {    //For every element in the array, print the element.
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        //40 90 93 54 30
        //[40, 90, 93, 54, 30]
    }
}
