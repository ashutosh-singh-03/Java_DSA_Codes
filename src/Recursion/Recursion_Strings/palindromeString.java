package Recursion.Recursion_Strings;

import java.util.Scanner;

public class palindromeString {
    static boolean isPalindrome(String s, int a, int b) {
        if (a >= b)
            return true;
        return (s.charAt(a) == s.charAt(b)) && isPalindrome(s, a + 1, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        System.out.println("Palindrome: " + isPalindrome(s, 0, s.length() - 1));
        sc.close();
    }
}
