package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Mervan Polat";
        System.out.println(name.toCharArray());     //Mervan Polat
        System.out.println(name.toUpperCase());     //MERVAN POLAT
        System.out.println(name.toLowerCase());     //mervan polat
        System.out.println(name.substring(2,4));    //rv

        System.out.println(name.length());          //12
        System.out.println(name.indexOf(1));        //-1
        System.out.println(name.lastIndexOf('h'));  //-1
    }
}
