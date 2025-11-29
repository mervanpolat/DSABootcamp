package ConditionalsAndLoops;

public class Scope {
    public static void main(String[] args) {
        //Any variable that is initialized outside is reachable inside a block scope, but vice versa is not possible.

        int a = 10;
        {
            a = 11;
            System.out.println(a);  //11
        }

        System.out.println(a);      //11
    }


}
