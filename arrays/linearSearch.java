package arrays;

import java.util.*;

public class linearSearch {
    public static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Taking input for the elements of the array
        System.out.println("Enter the elements of the array: ");
        int[] arr = inputArray(size);

        // Searching for an element in the array
        System.out.print("Enter the element to find: ");
        int x = sc.nextInt();

        int index = -1; // Initializing index to -1 to handle the case if element is not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println(x + " is at index: " + index);
        }

        // Finding the maximum value in the array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println("\nMax value in the array is: " + max);

        // Finding the second maximum value in the array
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                secMax = Math.max(secMax, arr[i]);
            }
        }
        if (secMax == Integer.MIN_VALUE) {
            System.out.println("\nSecond Max value does not exist.");
        } else {
            System.out.println("\nSecond Max value in the array is: " + secMax);
        }

        // Finding the minimum value in the array
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println("\nMin value in the array is: " + min);

        sc.close();
    }
}