package Questions.Sorting;

import java.util.*;

//Given two integer arrays a[] and b[].Return the list of elements common to both the
// lists and return the list in sorted order. Duplicates may be there in the output list.
public class commonElements {
    public static ArrayList<Integer> commonElementAL(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) i++;
            else j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 6, 1, 7, 9, 8, 2, 2};
        int[] arr2 = {9, 7, 3, 4, 9};

        System.out.println(commonElementAL(arr1, arr2));
    }
}