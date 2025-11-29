package ConditionalsAndLoops;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        //Unknown number of parameters => Varargs
        fun(12,43,34,3,4,45,345,345,34,5345);   //[12, 43, 34, 3, 4, 45, 345, 345, 34, 5345]
        multiple(2,3,"Mervan", "Polat");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(a + " " + b);
        System.out.println(Arrays.toString(v));
    }
}
