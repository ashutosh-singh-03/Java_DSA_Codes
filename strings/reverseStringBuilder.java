package strings;

import java.util.*;

public class reverseStringBuilder {

    public static void swap(StringBuilder sb) {
        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string builder: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        System.out.println("Original StringBuilder: " + sb);
        swap(sb);
        System.out.println("Reversed StringBuilder: " + sb);

        sc.close();
    }
}
