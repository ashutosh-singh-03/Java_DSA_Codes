package Arrays.OneDimensionalArray.PracticeQuestions;

import java.util.Scanner;

public class linearSearch {

    // Function to take input for an array
    public static int[] inputArray(int size, Scanner sc) {
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------------------- Input Array --------------------
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = inputArray(size, sc);

        // -------------------- Linear Search --------------------
        System.out.print("\nEnter the element to find: ");
        int target = sc.nextInt();

        int index = -1; // Initialize index to -1 to handle the case if the element is not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println(target + " is at index: " + index);
        }

        // -------------------- Finding Maximum & Second Maximum --------------------
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("\nMax value in the array is: " + max);
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second Max value does not exist.");
        } else {
            System.out.println("Second Max value in the array is: " + secondMax);
        }

        // -------------------- Finding Minimum Value --------------------
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println("\nMin value in the array is: " + min);

        sc.close(); // Close Scanner to prevent resource leaks
    }
}