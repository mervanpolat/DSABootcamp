package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";

        System.out.println(a==b);           //true
        System.out.println(a.equals(b));    //true

        String c = new String("Kunal");
        // == Checks if the reference variables are pointing to the same object
        System.out.println(b==c);           //false
        // .equals() checks if the values are equal to each other.
        System.out.println(b.equals(c));    //true

    }
}
