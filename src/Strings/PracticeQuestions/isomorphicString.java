package Strings.PracticeQuestions;

import java.util.Scanner;

public class isomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        char[] a = new char[128]; // 128 to store all characters
        // for the first string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);

            if (a[ch] == '\0')
                a[ch] = dh;
            else {
                if (a[ch] != dh)
                    return false;
            }
        }

        for (int i = 0; i < 128; i++) {
            a[i] = '\0';
        }

        // for the second string
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);

            if (a[ch] == '\0')
                a[ch] = dh;
            else {
                if (a[ch] != dh)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Leet 205
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not isomorphic.");
        } else {
            boolean flag = isIsomorphic(str1, str2);

            if (!flag)
                System.out.println("Strings are not isomorphic.");
            else
                System.out.println("Strings are isomorphic.");
        }
        sc.close();
    }
}