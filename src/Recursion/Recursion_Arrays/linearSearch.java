package Recursion.Recursion_Arrays;

import java.util.ArrayList;

public class linearSearch {
    static boolean searchElement(int[] arr, int idx, int target) {
        if (idx >= arr.length)
            return false;
        if (arr[idx] == target)
            return true;
        return searchElement(arr, idx + 1, target);
    }

    static int findFirstIndex(int[] arr, int idx, int target) {
        if (idx >= arr.length)
            return -1;
        if (arr[idx] == target)
            return idx;
        return findFirstIndex(arr, idx + 1, target);
    }

    static void findIdxOfAppearance(int[] arr, int idx, int target) {
        if (idx >= arr.length)
            return;
        if (arr[idx] == target)
            System.out.print(idx + " ");
        findIdxOfAppearance(arr, idx + 1, target);
    }

    static ArrayList<Integer> findAllIndices(int[] arr, int idx, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx >= arr.length)
            return ans;

        if (arr[idx] == target)
            ans.add(idx);

        ArrayList<Integer> smallAns = findAllIndices(arr, idx + 1, target);
        ans.addAll(smallAns);
        return ans;
    }

    static int findLastIndexForward(int[] arr, int idx, int target) {
        if (idx == arr.length)
            return -1;

        int result = findLastIndexForward(arr, idx + 1, target);
        if (result != -1)
            return result;
        if (arr[idx] == target)
            return idx;
        return -1;
    }

    static int findLastIndexBackward(int[] arr, int idx, int target) {
        if (idx < 0)
            return -1;
        if (arr[idx] == target)
            return idx;
        return findLastIndexBackward(arr, idx - 1, target);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 4, 4, 4 };
        int target = 4;
        System.out.print("Element Found: " + searchElement(a, 0, target));
        System.out.print("\nIndex: " + findFirstIndex(a, 0, target));
        System.out.println();
        findIdxOfAppearance(a, 0, target);

        System.out.print("\nUsing Array List: ");
        ArrayList<Integer> ans = findAllIndices(a, 0, target);
        System.out.print(ans);

        System.out.print("\nLast Index Using Forward Approach: " + findLastIndexForward(a, 0, target));
        System.out.print("\nLast Index Using Backward Approach: " + findLastIndexBackward(a, a.length - 1, target));
    }
}
