package Arrays.OneDimensionalArray;

import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] x = arr; // shallow copy of array i.e. both points to same reference
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();

//        Deep Copy
        int[] deep = Arrays.copyOf(arr, 4);
        for (int i : deep) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}