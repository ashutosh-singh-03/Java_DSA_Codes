package Arrays.OneDimensionalArray;

import java.util.ArrayList;
import java.util.Collections;

public class sumOfTwoNumbersInArrays {
    public static ArrayList<Integer> sumNumsInArr(int[] arr, int[] arr1) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = arr.length - 1, j = arr1.length - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int x = 0, y = 0;

            if (i >= 0) x = arr[i];
            if (j >= 0) y = arr1[j];

            int sum = x + y + carry;
            ans.add(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 3, 9, 7, 3};
        int[] arr2 = {4, 2, 8};

        for (int i : arr1) System.out.print(i + " ");
        System.out.println();
        for (int i : arr2) System.out.print(i + " ");
        System.out.println();

        System.out.print(sumNumsInArr(arr1, arr2));
    }
}