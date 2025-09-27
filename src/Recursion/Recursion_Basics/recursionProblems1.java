package Recursion.Recursion_Basics;

public class recursionProblems1 {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // find the factorial of a number using recursion
        System.out.println("Factorial: " + factorial(5));

        // find the nth fibonacci number using recursion
        System.out.println("\nFibonacci: " + fibonacci(7));

        // Printing the series
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}