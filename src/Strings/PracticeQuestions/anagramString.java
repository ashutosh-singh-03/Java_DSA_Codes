package Strings.PracticeQuestions;

import java.util.*;

public class anagramString {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Problem. Given two strings S and T, return true if T is an anagram of S, and
        // false otherwise. One word is anagram to other when word2 is shuffled version
        // of word 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String2: ");
        String str2 = sc.nextLine();

        boolean flag = isAnagram(str1, str2);

        if (!flag)
            System.out.print("Strings are not Anagram.");
        else
            System.out.println("Strings are anagram.");

        sc.close();
    }
}