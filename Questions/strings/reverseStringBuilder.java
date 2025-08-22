package Questions.Strings;
import java.util.Scanner;

public class reverseStringBuilder {
    public static void Reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        int left = 0, right = sb.length() - 1;

        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        System.out.println("Original String: " + input);
        System.out.print("Reverse String: ");
        Reverse(input);
        
        // With InBuilt Function
        StringBuilder sb = new StringBuilder(input);
        System.out.println("With Inbuilt function: " + sb.reverse());

        sc.close();
    }
}
