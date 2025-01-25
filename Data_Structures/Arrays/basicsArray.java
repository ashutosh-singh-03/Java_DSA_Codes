package Arrays;

import java.util.Scanner;

public class basicsArray {

    public static void main(String[] args) {

        // Declaration, memory allocation, and initialization of an array
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        // Printing the array using a loop
        System.out.print("Array elements: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Taking input for a new array from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Declaration and initialization of a user-defined array
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Printing the user-defined array
        System.out.println();
        System.out.print("Entered Array is: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        sc.close();
    }
}
