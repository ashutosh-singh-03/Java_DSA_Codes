package Basics.MathProblems;

import java.util.Scanner;

class PalindromeNumber {
    public static boolean isPalindromeUsingString(int num) {
        if (num >= 0 && num < 10)
            return true;

        String s = Integer.toString(num);
        char[] ch = s.toCharArray();

        int left = 0, right = ch.length - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(ch);
        return s.equals(reversed);
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;

        int original = num;
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isPalindrome(num));
        System.out.println(isPalindromeUsingString(num));
    }
}