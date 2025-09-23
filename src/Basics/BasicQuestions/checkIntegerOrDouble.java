package Basics.BasicQuestions;

import java.util.Scanner;

public class checkIntegerOrDouble {
    public static void main(String[] args) {
        // to take double as input and check if it's an integer, 6.0 - int && 6.9 - double
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a double value: ");
        double x = sc.nextDouble();
        if (x - (int) x > 0)
            System.out.println("Is not Integer.");
        else
            System.out.println("Is Integer.");

        sc.close();
    }
}