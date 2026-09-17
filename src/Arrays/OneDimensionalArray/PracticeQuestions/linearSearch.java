package Arrays.OneDimensionalArray.PracticeQuestions;

import java.util.Scanner;

import static Utils.ArrayUtils.inputArray;

public class LinearSearch {
    public static int findElement(int[] arr, int target) {
        int index = -1; // Initialize index to -1 to handle the case if the element is not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = inputArray(size, sc);

        System.out.print("\nEnter the element to find: ");
        int target = sc.nextInt();

        int index = findElement(arr, target);
        if (index == -1) System.out.println("Element not found.");
        else System.out.println(target + " is at index: " + index);

        sc.close();
    }
}