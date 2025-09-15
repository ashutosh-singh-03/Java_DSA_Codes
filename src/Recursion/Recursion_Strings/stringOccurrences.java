package Recursion.Recursion_Strings;

import java.util.Scanner;

public class stringOccurrences {
    // remove all occurrences of a character from string
    static String removeCharUsingIter(String s, char c) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c)
                ans += s.charAt(i);
        }
        return ans;
    }

    static String removeCharUsingRecur(String s, char c, int idx) {
        if (idx == s.length())
            return "";

        String smallAns = removeCharUsingRecur(s, c, idx + 1);

        if (s.charAt(idx) != c)
            return s.charAt(idx) + smallAns;
        return smallAns;
    }

    static String removeCharUsingRecurNoIdx(String s, char c) {
        if (s.length() == 0)
            return "";

        String smallAns = removeCharUsingRecurNoIdx(s.substring(1), c);

        if (s.charAt(0) != c)
            return s.charAt(0) + smallAns;
        return smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String and a Character: ");
        String s = sc.nextLine();
        char c = sc.next().charAt(0);

        System.out.println("Old String: " + s);
        System.out.println("New String Using Iteration: " + removeCharUsingIter(s, c));
        System.out.println("New String Using Recursion: " + removeCharUsingRecur(s, c, 0));
        System.out.println("New String Using Recursion2: " + removeCharUsingRecurNoIdx(s, c));

        sc.close();
    }
}
