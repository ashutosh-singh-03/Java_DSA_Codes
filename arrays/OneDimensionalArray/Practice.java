package arrays.OneDimensionalArray;

import java.util.Scanner;

public class Practice {
    public static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Identify students with marks less than 35 and print their roll
        // numbers
        System.out.print("Enter the number of students: ");
        int studentCount = sc.nextInt();

        System.out.println("Enter marks of students:");
        int[] students = inputArray(studentCount);

        System.out.println("Students with marks less than 35:");
        for (int i = 0; i < studentCount; i++) {
            if (students[i] < 35) {
                System.out.println("Roll Number: " + (i + 1));
            }
        }

        // Task 2: Calculate the sum and product of all the elements in the array
        int sum = 0;
        int product = 1;

        for (int marks : students) {
            sum += marks;
            product *= marks;
        }

        System.out.println("\nSum of marks: " + sum);
        System.out.println("Product of marks: " + product);

        sc.close();
    }
}
