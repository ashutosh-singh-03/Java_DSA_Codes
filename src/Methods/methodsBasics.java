package Methods;

import java.util.Scanner;

public class methodsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
//        Functions of Math Module - they return a double value
        System.out.println(Math.sqrt(num)); // Square Root
        System.out.println(Math.cbrt(num)); // Cube Root

        System.out.println("Enter three values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(Math.max(a, b), c);
        System.out.println("Maximum of All Three is: " + max);
    }
}