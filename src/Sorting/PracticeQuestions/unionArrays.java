package Sorting.PracticeQuestions;

import java.util.ArrayList;

public class unionArrays {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
        }

        while (i < a.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }
        while (j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }


        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1};
        int[] b = {2, 2, 2, 2, 2};

        System.out.println("Union of Arrays: " + findUnion(a, b));
    }
}