package LinearSearch;

public class Q7 {
    public static void main(String[] args) {
        //Q7: https://leetcode.com/problems/richest-customer-wealth/description/
        int[][]arr = {
                {1,2,3},
                {3,2,1}
        };

    }

    static int determineWealth(int[][] arr){
        if(arr.length == 0) return 0;
        //Person = row
        //Account = col
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            if (sum > max) max = sum;
        }
        return max;
    }
}
