package Basics.Conditionals;

import java.util.Scanner;

public class calculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int num_1 = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int num_2 = sc.nextInt();
        System.out.println("Press + for addition.\nPress - for subtraction.\nPress * for Multiplication.\nPress / for division.");
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                System.out.println(num_1 + num_2);
                break;
            case '-':
                System.out.println(num_1 - num_2);
                break;
            case '*':
                System.out.println(num_1 * num_2);
                break;
            case '/':
                System.out.println(num_1 / num_2);
                break;
            default:
                System.out.println("Choose correct option.");
                break;
        }

        sc.close();
    }
}