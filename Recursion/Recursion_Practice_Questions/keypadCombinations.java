package Recursion_Practice_Questions;

public class keypadCombinations {
    static void combinations(String dig, String[] keyPad, String res) {
        if (dig.length() == 0) {
            System.out.print(res + " ");
            return;
        }

        int currNum = dig.charAt(0) - '0'; // converts char to int
        String currChoices = keyPad[currNum];

        for (int i = 0; i < currChoices.length(); i++) {
            combinations(dig.substring(1), keyPad, res + currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        String digits = "253";
        String[] keyPadMap = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" }; // from 0 to 9
        combinations(digits, keyPadMap, "");
    }
}
