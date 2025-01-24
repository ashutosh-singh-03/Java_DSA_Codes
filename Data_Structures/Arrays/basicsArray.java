package Data_Structures.Arrays;

import java.util.Scanner;

public class basicsArray {
    public static void main(String[] args) {
        int[] arr1 = new int[5]; //declaration and memory allocation

        // Initialization
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        // Printing Array
        System.out.print(arr1[0] + " ");
        System.out.print(arr1[1] + " ");
        System.out.print(arr1[2] + " ");
        System.out.print(arr1[3] + " ");
        System.out.print(arr1[4] + " ");
        System.out.println();

        // Using Loops for input and output
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Entered Array is: ");
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        sc.close();
    }
}
