package ConditionalsAndLoops;

public class Shadowing {
    static int x = 90;
    static int y = 10;
    public static void main(String[] args) {
        System.out.println(x);  //90
        int x = 30; //the class variable x = 90 will be shadowed by this line
        System.out.println(x);  //30
        funX();                 //90
        System.out.println(y);  //10

        int y;  //Scope will begin when the variable is initialized.
        //System.out.println(y); //Error, you have to initialize it before printing it.
        y = 19;
        System.out.println(y);  //19
    }

     static void funX() {
         System.out.println(x);
    }
}
