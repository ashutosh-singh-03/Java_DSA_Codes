package Arrays.OneDimensionalArray;

import java.util.Scanner;

public class Practice {

    // Function to take input for an array
    public static int[] inputArray(int size, Scanner sc) {
        int[] arr = new int[size];

        System.out.println("Enter marks of students:");
        for (int i = 0; i < size; i++) {
            System.out.print("Student " + (i + 1) + " marks: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Identify students with marks < 35
        System.out.print("Enter the number of students: ");
        int studentCount = sc.nextInt();

        int[] marks = inputArray(studentCount, sc);

        System.out.println("\nStudents with marks less than 35:");
        boolean hasFailedStudents = false;

        for (int i = 0; i < studentCount; i++) {
            if (marks[i] < 35) {
                System.out.println("Roll Number: " + (i + 1));
                hasFailedStudents = true;
            }
        }

        if (!hasFailedStudents) {
            System.out.println("None");
        }

        // Task 2: Calculate the sum and product of all elements
        int sum = 0;
        int product = 1;

        for (int mark : marks) {
            sum += mark;
            product *= mark;
        }

        System.out.println("\nSum of marks: " + sum);
        System.out.println("Product of marks: " + product);

        sc.close(); // Close Scanner to prevent resource leaks
    }
}