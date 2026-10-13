package Basics.MathProblems;

public class SwappingNumbers {
    public static void swapBitwise(int num1, int num2) {
        System.out.println("Initial Values: " + num1 + " " + num2);
        num1 = num1 ^ num2;
        System.out.println("After Step 1: " + num1 + " " + num2);
        num2 = num1 ^ num2;
        System.out.println("After Step 2: " + num1 + " " + num2);
        num1 = num1 ^ num2;
        System.out.println("Final Values: " + num1 + " " + num2);
    }

    public static void swapUsingTemp(int num1, int num2) {
        System.out.println("Initial Values: " + num1 + " " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Final Values: " + num1 + " " + num2);
    }

    public static void swapUsingArithmetic(int num1, int num2) {
        System.out.println("Initial Values: " + num1 + " " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Final Values: " + num1 + " " + num2);
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;
        swapBitwise(num1, num2);
        swapUsingTemp(num1, num2);
        swapUsingArithmetic(num1, num2);
    }
}
