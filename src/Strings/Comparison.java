package Strings;

import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {
        //1. String comparison and String Pool
        String a = "Kunal";
        String b = "Kunal";

        System.out.println(a==b);           //true
        System.out.println(a.equals(b));    //true

        String c = new String("Kunal");
        // == Checks if the reference variables are pointing to the same object
        System.out.println(b==c);           //false
        // .equals() checks if the values are equal to each other.
        System.out.println(b.equals(c));    //true

        //2. toString() Method
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5,6,7,8,9,10}));   //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]



    }
}
