package Sorting.PracticeQuestions;

import java.util.Scanner;

public class kthSmallestElement {
    public static int kSmallestElement(int[] arr, int k) {
        if (k > arr.length) return -1;
        else {
            for (int i = 0; i < k; i++) {
                int min = Integer.MAX_VALUE, minIdx = -1;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        minIdx = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
            return arr[k - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 5, 2, 6, 9};

        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();

        System.out.println(kSmallestElement(arr, k));
    }
}