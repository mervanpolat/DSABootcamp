package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        //Number of rows is mandatory, but not the columns.

        /*
        You can imagine 2D arrays as array of array. Each of the row is an array itself.
        arr[1] will give you [4,5,6], which is an array.
        arr[1][0] will give you the element located in the second row and first column, which is 4.

        Multidimensional arrays must have a fixed number of rows, but can have variable length of columns.

        */


        //Input in multidimensional arrays

//        int[][]arr = {
//                {1,2,3},  //0th index -> row
//                {4,5},    //1st index -> row
//                {6,7,8,9} //2nd index -> row
//        };

        int[][] arr = new int[3][2];        // 2D array with 3 rows and 2 columns
        System.out.println(arr.length);     // Number of rows → 3
        System.out.println(arr[0].length);  // Number of columns in row 0 → 2

        Scanner input = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            //arr[row].length → Retrieve the number of columns in the current row (always 2 in our case).
            for (int col = 0; col < arr[row].length; col++) {
                // Read a number from the user into the current cell
                arr[row][col] = input.nextInt();
            }
        }

        // Print the 2D array as a matrix
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        //19 38
        //57 10
        //43 23

        System.out.println();

        // Print each row of the 2D array using Arrays.toString() for cleaner formatting
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        //[19, 38]
        //[57, 10]
        //[32, 43]

        System.out.println();
        // Because each row in a 2D array is itself an array, we can leverage the beauty of enhanced for loop.
        for(int[]array : arr) {
            System.out.println(Arrays.toString(array));
        }

        //Same use case but for String array
        String[] stringArray = new String[4];
        System.out.println(stringArray[0]);

        for (String element:  stringArray) {
            System.out.println(element);
        }
    }
}
