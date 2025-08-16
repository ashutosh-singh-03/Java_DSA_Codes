package Questions;

import java.util.Scanner;

public class recursionGCD {
    public static int bruteGCD(int x, int y) {
        int div = Math.min(x, y);
        for (int i = div; i >= 1; i--) {
            if (x % i == 0 && y % i == 0)
                return i;
        }
        return 1;
    }

    public static int iterativeGCD(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    public static int recursiveGCD(int x, int y) {
        if (y == 0)
            return x;
        return recursiveGCD(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("GCD by Brute: " + bruteGCD(a, b));
        System.out.println("GCD by iteration (long division): " + iterativeGCD(a, b));
        System.out.println("GCD by recursion: " + recursiveGCD(a, b));

        // LCM of two numbers
        int result = recursiveGCD(a, b);
        System.out.println("LCM: " + (a * b) / result);

        sc.close();
    }
}
