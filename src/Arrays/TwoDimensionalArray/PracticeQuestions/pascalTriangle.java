package Arrays.TwoDimensionalArray.PracticeQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalTriangle {
    public static List<List<Integer>> generateDirect(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) l.add(1);
                else l.add(arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1));
            }
            arr.add(l);
        }
        return arr;
    }

    public static List<List<Integer>> generateTwoPass(int n) {
        List<List<Integer>> arr = new ArrayList<>();

        // First pass → fill each row with 1's
        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) l.add(1); // initially all values = 1
            arr.add(l);
        }

        // Second pass → update the middle values
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                int newVal = arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1);
                arr.get(i).set(j, newVal);
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

//        Approach 1: Direct
        System.out.println("\nPascal's Triangle (Direct Calculation):");
        System.out.println(generateDirect(n));

        // Approach 2: Two-Pass
        System.out.println("\nPascal's Triangle (Two-Pass Method):");
        System.out.println(generateTwoPass(n));

        sc.close();
    }
}