package Basics.Conditionals;

import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of English: ");
        int English = sc.nextInt();
        System.out.println("Enter the marks of Maths: ");
        int Maths = sc.nextInt();
        System.out.println("Enter the marks of Science: ");
        int Science = sc.nextInt();

        int totalMarks = English + Maths + Science;
        int Percentage = ((totalMarks * 100) / 300);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + Percentage);
        if (Percentage >= 81 && Percentage <= 100) System.out.println("Grades: Very Good");
        else if (Percentage >= 61 && Percentage <= 80) System.out.println("Grades: Good");
        else if (Percentage >= 41 && Percentage <= 60) System.out.println("Grades: Average");
        else System.out.println("Grades: Fail");

        sc.close();
    }
}