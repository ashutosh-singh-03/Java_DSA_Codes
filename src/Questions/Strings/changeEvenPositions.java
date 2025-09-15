package Questions.Strings;

import java.util.Scanner;

public class changeEvenPositions {
    public static void main(String[] args) {
        // Ques. Update all even positions of the string to 'a'.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0)
                ans += 'a';
            else
                ans += ch;
        }
        System.out.print("Original String: " + str);
        System.out.print("\nEdited String: " + ans);

        sc.close();
    }
}
