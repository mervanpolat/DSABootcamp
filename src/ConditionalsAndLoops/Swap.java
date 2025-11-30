package ConditionalsAndLoops;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);    //10 20
        swap(a,b);                          //20 10
    }

    static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
        System.out.println(a + " " + b);
    }
}
