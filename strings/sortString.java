package strings;

import java.util.*;

public class sortString {
    public static void main(String[] args) {
        // Method 1 - using char Array and then sort function in the array
        String input = "Ashutosh";
        char[] ch = input.toCharArray();

        System.out.print("Original String: ");
        for(char ele : ch) System.out.print(ele);

        Arrays.sort(ch);

        System.out.print("\nSorted String: ");
        for(char ele : ch) System.out.print(ele);
    }
}
