package Arrays;

import java.util.*;

public class linearSearch {
    public static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        int arr[] = inputArray(size);

        System.out.print("Enter the element to find: ");
        int x = sc.nextInt();

        int index = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = true;
                index = i;
                break;
            }
        }

        if (flag == false)
            System.out.println("Element not found.");
        else
            System.out.print(x + " is at index: " + index);

        // Finding the Maximum Value out of all the elements in the array
        int max = arr[0]; // you can also use max = 0/-1/Integer.MIN_VALUE as it is the smallest value in
                          // the integer
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            // max = Math.max(max, arr[i]); // we can Also use the Math.max() function also
        }
        System.out.println("\nMax value in the array is: " + max);

        // Finding the Minimum Value out of all the elements in the array
        int min = arr[0]; // you can also use min = 0/-1/Integer.MIN_VALUE as it is the smallest value in
                          // the integer
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            // min = Math.min(min, arr[i]); // we can Also use the Math.min() function also
        }
        System.out.println("\nMin value in the array is: " + min);

        sc.close();
    }
}