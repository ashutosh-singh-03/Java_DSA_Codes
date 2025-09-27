package Strings.PracticeQuestions;

// Write a function named capitalize that gets a string (only lower case) and capitalizes it.
// For example, this is an example  ->  This Is An Example

import java.util.Scanner;

class capitalizeChar {
    static String capitalize(String s) {
        if (s == null || s.isEmpty())
            return s;

        char[] chars = s.toCharArray();
        boolean capitalNext = true;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                capitalNext = true;
            else if (capitalNext) {
                chars[i] = Character.toUpperCase(chars[i]);
                capitalNext = false;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Capitalized String: " + capitalize(s));
        sc.close();
    }
}