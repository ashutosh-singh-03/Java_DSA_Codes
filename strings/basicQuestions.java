package strings;

import java.util.Scanner;

public class basicQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        int countVowel = 0;
        // 1. Count all the number of vowels from a string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch) == true)
                countVowel++;
        }
        System.out.println("\nTotal Vowels: " + countVowel);

        // 2. All the substrings of the string
        System.out.println("All the substrings of the String: ");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println();
        }

        // 3. Take integer input and convert it to a string
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String converted_string = "" + n;
        System.out.println("Converted String: " + converted_string);

        // 4. Return total number of digits in a number without using a loop
        String count = Integer.toString(n);
        System.out.print("Number of digits: " + count.length());
        sc.close();
    }

    public static boolean isVowel(char ch) {
        // if (ch == 'a' || ch == 'A')
        // return true;
        // if (ch == 'e' || ch == 'E')
        // return true;
        // if (ch == 'i' || ch == 'I')
        // return true;
        // if (ch == 'o' || ch == 'O')
        // return true;
        // if (ch == 'u' || ch == 'U')
        // return true;

        // return false;

        // OR
        String vowels = "aeiouAEIOU";
        if (vowels.indexOf(ch) != -1)
            return true;
        return false;
    }
}
