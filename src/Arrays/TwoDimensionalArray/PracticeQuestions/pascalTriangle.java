package Arrays.TwoDimensionalArray.PracticeQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    l.add(1);
                else
                    l.add(arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1));
            }
            arr.add(l);
        }

        // OR - creating another loop for replacing the 1's
        // for (int i = 2; i < n; i++) {
        // for (int j = 1; j <= i - 1; j++) {
        // arr.get(i).set(j, arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1));
        // }
        // }

        for (List<Integer> row : arr) {
            System.out.println(row);
        }

        sc.close();
    }
}