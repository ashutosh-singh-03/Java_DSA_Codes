package Practice;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Given an array for the marks of students, if the marks is less than 35
        // give its roll (roll = index + 1)
        System.out.print("Enter the number of students: ");
        int student_count = sc.nextInt();

        int students[] = new int[student_count];

        System.out.println("Enter marks of students: ");
        for (int i = 0; i < student_count; i++) {
            System.out.print("Enter element " + i + ": ");
            students[i] = sc.nextInt();
        }

        for (int i = 0; i < student_count; i++) {
            if (students[i] < 35)
                System.out.println("Roll Number: " + (i + 1));
        }

        // Calculate the sum of all the elements of the array
        int arr[] = { 1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];            
        }
        System.out.print("Sum: " + sum);
        sc.close();
    }
}
