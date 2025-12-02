package Recursion;

public class Numbers {
    public static void main(String[] args) {
        //Write a function that takes in a number and prints it, print first 5 numbers
        print(1);
    }

    static void print(int n){
        if (n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // This is also called tail recursion
        print(n+1);
    }
}
