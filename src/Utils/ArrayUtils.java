package Utils;

import java.util.Scanner;

public class ArrayUtils {
    public static int[] inputArray(int size, Scanner sc) {
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
