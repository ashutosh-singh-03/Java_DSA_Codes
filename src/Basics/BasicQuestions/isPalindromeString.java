package Basics.BasicQuestions;

import java.util.*;

public class isPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // WAP to check if the given string is palindrome or not
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        int left = 0;
        int right = input.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome)
            System.out.print(input + " is a Palindrome.");
        else
            System.out.print(input + " is not a Palindrome.");

        sc.close();
    }
}