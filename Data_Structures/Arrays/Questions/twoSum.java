package Arrays.Questions;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Finding the pair of elements whose sum is equal to the target
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        // for printing all the pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }

        // for printing only one pair with thier indices
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
            if(flag == true) break;
        }
        System.out.println("The elements at " + ele1 + " and " + ele2 + " form " + target);
        sc.close();
    }
}
