package LinearSearch;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        //Q1: Search in Strings
        String name = "Mervan Polat";
        char targetLetter = 'c';
        System.out.println(searchInString(name,targetLetter));      //false
        System.out.println(Arrays.toString(name.toCharArray()));    //[M, e, r, v, a, n,  , P, o, l, a, t]

    }

    static boolean searchInString(String text, char target) {
        if (text.isEmpty()) return false;

        for (char ch : text.toCharArray()) {
            if (ch == target) return true;
        }
        return false;
    }
}
