package Recursion.Recursion_Strings;

import java.util.Scanner;

public class reverseOfString {
    static String reverseString(String s, int idx) {
        if (idx == s.length())
            return "";
        return reverseString(s, idx + 1) + s.charAt(idx);
    }

    static String reverseStringNoIdx(String s) {
        if (s.length() == 0)
            return "";
        return reverseStringNoIdx(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        System.out.println("Reverse: " + reverseString(s, 0));
        System.out.println("Reverse No Idx: " + reverseStringNoIdx(s));

        String rev = reverseStringNoIdx(s);
        if (rev.equals(s))
            System.out.printf("%s is Palindrome.", s);
        else
            System.out.printf("%s is not Palindrome.", s);

        sc.close();
    }
}
