package Questions.Strings;

import java.util.Scanner;

public class occurrenceOfChar {
    public static void main(String[] args) {
        // Ps - Print the character of the lowercase English alphabet String, with most
        // frequency
        // We can solve this by using a frequency array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] freq = new int[26]; // 0 - a, 1 - b etc

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int idx = (int) ch - 97;
            freq[idx]++;
        }
        int maxFreq = -1;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }
        System.out.print("Max Frequency: " + maxFreq);

        System.out.print("\nCharacter(s) Occurred Most: ");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                char ch = (char) (i + 97);
                System.out.print(ch + " ");
            }
        }

        sc.close();
    }
}
