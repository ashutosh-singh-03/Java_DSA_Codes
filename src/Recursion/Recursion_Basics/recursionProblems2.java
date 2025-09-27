package Recursion.Recursion_Basics;

public class recursionProblems2 {
    public static int sumOfDigits(int n) {
        if (n >= 0 && n <= 9)
            return n;
        return sumOfDigits(n / 10) + (n % 10);
    }

    public static int countOfDigits(int n) {
        if (n >= 0 && n <= 9)
            return 1;
        return countOfDigits(n / 10) + 1;
    }

    public static int powerApproach1(int p, int q) {
        if (q == 0)
            return 1;
        return powerApproach1(p, q - 1) * p;
    }

    public static int powerApproach2(int p, int q) {
        if (q == 0)
            return 1;
        int smallPow = powerApproach2(p, q / 2);
        if (q % 2 == 0)
            return smallPow * smallPow;
        return (smallPow * smallPow) * p;
    }

    public static void main(String[] args) {
        // Sum of digits of a number
        System.out.println("Sum of Digits: " + sumOfDigits(12345));

        // Count of digits of a number
        System.out.println("Count of Digits: " + countOfDigits(123));

        // P power Q -- Approach 1
        System.out.println("P raised to the power Q: " + powerApproach1(3, 3));

        // P power Q -- Approach 2
        System.out.println("P raised to the power Q: " + powerApproach2(3, 3));
    }
}