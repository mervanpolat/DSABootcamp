package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        int[]arr2 = {10,9,8,7,6,5,4,3,2,1};

        System.out.println(orderAgnostic(arr,4));       //3
        System.out.println(orderAgnostic(arr2,8));      //2
    }

    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //Find out, whether the array is in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            // Find the middl element
            int mid = start+ (end - start) / 2;

            if(arr[mid] == target) return mid;

            if(isAscending){
                // Target element is on the left side compared to my middle element
                if(target < arr[mid]){
                    end = mid-1;
                    // Target element is on the right side compared to my middle element
                } else {
                    start = mid+1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid-1;
                    // Target element is on the right side compared to my middle element
                } else {
                    start = mid+1;
                }
            }

        }
        //If the number is not found, then return -1
        return -1;
    }
}
