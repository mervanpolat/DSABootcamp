package Arrays;

import java.util.Arrays;

public class Syntax {
    public static void main(String[] args) {
        int[]arr = new int[5];
        int[]arr2 = {21,32,3,4,2};

        int[]arr3; //Declaration of array, it's stored in the stack
        arr3 = new int[5]; //Initialization, it's created in heap

        String[] array = new String[5];
        System.out.println(Arrays.toString(array)); // null -> It's not a datatype.
        System.out.println(Arrays.toString(arr3));

    }
}
