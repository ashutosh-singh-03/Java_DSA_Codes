package Questions.Sorting;

import java.util.ArrayList;

public class moveZeroes {

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void moveZerosBruteForce(int[] arr) {
        int noz = 0;
        for (int ele : arr) {
            if (ele == 0)
                noz++;
        }

        for (int x = 0; x < noz; x++) {
            for (int i = 0; i < arr.length - 1 - x; i++) {
                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println("Brute Force: ");
        print(arr);
    }

    static void moveZerosBubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] == 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("Bubble Sort: ");
        print(arr);
    }

    public static void moveZerosArrayList(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        int noz = 0; // number of zeroes

        for (int ele : arr) {
            if (ele != 0)
                nums.add(ele);
            else
                noz++;
        }
        for (int i = 0; i < noz; i++) {
            nums.add(0);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums.get(i);
        }

        System.out.println("Array List: ");
        print(arr);
    }

    public static void moveZerosNoExtraSpace(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if (i != j)
                    swap(arr, i, j);
                j++;
            }
        }

        System.out.println("Without any extra space: ");
        print(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 3, 0, 4, 5, 0, 8 };
        System.out.println("Original Array: ");
        print(arr);

        System.out.println("Sorted Arrays: \n");
        moveZerosBruteForce(arr);
        moveZerosBubbleSort(arr, arr.length);
        moveZerosArrayList(arr);
        moveZerosNoExtraSpace(arr);
    }
}
