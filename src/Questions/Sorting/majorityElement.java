package Questions.Sorting;

import java.util.*;

//LeetCode 169 - to return the majority element i.e. the element occurring more than n/2 times
public class majorityElement {
    public static int byBuiltInSort(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }

    public static int selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int min = Integer.MAX_VALUE, minIdx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
        return arr[n / 2];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3};
        System.out.println(byBuiltInSort(arr));
        System.out.println(selectionSort(arr));
    }
}