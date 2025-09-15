package Arrays.TwoDimensionalArray;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. WAP to store roll and marks of students
        System.out.print("Enter the number of students: ");
        int m = sc.nextInt();

        int[][] students = new int[m][2];

        for (int i = 0; i < m; i++) {
            System.out.print("Enter Roll Number for Student " + (i + 1) + ": ");
            students[i][0] = sc.nextInt();
            System.out.print("Enter Marks for Student " + (i + 1) + ": ");
            students[i][1] = sc.nextInt();
        }

        System.out.println("\nRecorded Students:");
        for (int[] ele : students) {
            for (int i : ele) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
