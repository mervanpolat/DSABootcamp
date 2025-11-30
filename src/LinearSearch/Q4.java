package LinearSearch;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        //Q4: Search for a particular number in a 2D array
        int[][]arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18, 12}
        };

        int target = 12;
        int[]answer = searchIn2D(arr,target);

        System.out.println();

        //Prints the cell where the target element is found
        System.out.println(Arrays.toString(answer));    //[1, 1]

        // Prints the whole 2D array
        for(int[]array : arr) {
            System.out.println(Arrays.toString(array));
        }
        //[23, 4, 1]
        //[18, 12, 3, 9]
        //[78, 99, 34, 56]
        //[18, 12]


    }

     static int[] searchIn2D(int[][] arr, int target) {
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if (arr[row][col] == target) {
                     return new int[]{row, col};
                 }
             }
         }
         return new int[]{-1, -1};
    }
}
