package Arrays.OneDimensionalArray.PracticeQuestions;

import java.util.Scanner;

import static Utils.ArrayUtils.inputArray;

public class MaximumAndMinimum {
    public static int maxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static int secondMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) secondMax = num;

        }
        return secondMax;
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static int secondMinValue(int[] arr) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) secondMin = num;

        }
        return secondMin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = inputArray(size, sc);

        System.out.println("\nLargest Element in the array is: " + maxValue(arr));
        System.out.println("\nSecond Largest Element in the array is: " + secondMaxValue(arr));
        System.out.println("\nMin value in the array is: " + minValue(arr));
        System.out.println("\nSecond Min value in the array is: " + secondMinValue(arr));

        sc.close();
    }
}
