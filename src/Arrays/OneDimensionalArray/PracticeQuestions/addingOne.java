package Arrays.OneDimensionalArray.PracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;

// Given a non-negative integer (without leading zeroes) represented as an array arr. Your task is
// to increment the number by 1. The digits are stored such that the most significant digit is at
// the starting index of the array.
public class addingOne {
    public static ArrayList<Integer> addOne(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length, carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }
        }
        if (carry == 1) ans.add(1);

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] arr1 = {5, 6, 7, 8};

        System.out.println(addOne(arr));
        System.out.println(addOne(arr1));
    }
}