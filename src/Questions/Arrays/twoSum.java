package Questions.Arrays;

import java.util.*;

public class twoSum {
    public static void twoSumAllPairs(int[] arr, int target) {
        // for printing all the pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
    }

    public static void twoSumPair(int[] arr, int target) {
        // for printing only one pair with their indices
        int ele1 = 0, ele2 = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ele1 = i;
                    ele2 = j;
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }
        System.out.println("The elements at " + ele1 + " and " + ele2 + " form " + target);
    }

    public static void twoSumOptimizedSorting(int[] arr, int target) { // tc reduced to nlogn
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println("Indices: " + i + " " + j);
                break;
            } else if (arr[i] + arr[j] > target) j--;
            else i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Finding the pair of elements whose sum is equal to the target
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        System.out.println("All Pairs with Sum: ");
        twoSumAllPairs(arr, target);

        System.out.println("One Pair With Indices: ");
        twoSumPair(arr, target);

        System.out.println("Optimized Sum: ");
        twoSumOptimizedSorting(arr, target);
        sc.close();
    }
}