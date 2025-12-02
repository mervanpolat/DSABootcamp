package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String name = "ey edip adanada pide ye";
        System.out.println(isPalindrome(name)); //true
    }

    static boolean isPalindrome(String text) {
        if (text == null || text.length() <= 1) return true;

        text = text.toLowerCase();
        text = text.replaceAll(" ", "");
        text = text.strip();

        for (int i = 0; i < text.length(); i++) {
            char start = text.charAt(i);
            char end = text.charAt(text.length() - 1 - i);
            if (start != end) return false;
        }
        return true;
    }
}
