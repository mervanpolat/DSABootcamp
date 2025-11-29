package ConditionalsAndLoops;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: (100-1000)");
        int number = input.nextInt();
        printArmstrongNumbers(number);
    }

    //Q1 Prime Numbers
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        int c =  2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        } return true;

    }

    //Q2 Armstrong Numbers
    //If n is a three-digit number then => 153 = 1^3 + 5^3 + 3^3 = 153 then it is an Armstrong number
    static boolean isArmstrong(int n) {
        int sum = 0;
        int original = n;

        while(n > 0) {
            int remainder = n % 10;
            n /= 10;
            sum = sum + (remainder*remainder*remainder);
        }
        return sum == original;
    }

    //Q3 Print Armstrong Numbers
    static void printArmstrongNumbers(int n) {
        for (int i = 0; i < n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
