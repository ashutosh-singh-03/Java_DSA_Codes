package Questions.Sorting;

import java.util.ArrayList;

public class moveZeroes {
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void method1(int[] arr) {
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
    }

    public static void method2(int[] arr) {
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
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        System.out.println("Original Array: ");
        print(arr);

        // method1(arr);
        method2(arr);

        System.out.println("Result Array: ");
        print(arr);
    }
}
