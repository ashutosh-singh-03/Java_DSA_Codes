package Questions.Strings;

import java.util.Scanner;

public class stringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        if (s == null)
            System.out.println("String is Empty.");

        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
        System.out.println("Reversed String: " + new String(ch));
        sc.close();
    }
}