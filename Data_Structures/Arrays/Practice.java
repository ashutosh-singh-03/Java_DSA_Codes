import java.util.Scanner;

public class Practice {
    public static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Given an array for the marks of students, if the marks is less than 35
        // give its roll (roll = index + 1)
        System.out.print("Enter the number of students: ");
        int student_count = sc.nextInt();

        int students[] = new int[student_count];

        System.out.println("Enter marks of students: ");
        students = inputArray(student_count);

        for (int i = 0; i < student_count; i++) {
            if (students[i] < 35)
                System.out.println("Roll Number: " + (i + 1));
        }

        // Calculate the sum and product of all the elements of the array
        int sum = 0;
        int prod = 1;

        for (int i = 0; i < students.length; i++) {
            sum += students[i];
            prod *= students[i];
        }
        System.out.print("Sum: " + sum);
        System.out.print("\nProduct: " + prod);

        sc.close();
    }
}
