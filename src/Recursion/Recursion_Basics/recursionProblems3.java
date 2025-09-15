package Recursion.Recursion_Basics;

public class recursionProblems3 {
    public static void multiples(int num, int k) {
        if (k == 0)
            return;

        multiples(num, k - 1);
        System.out.print(num * k + " ");
    }

    public static int alternateSum(int n) {
        if (n == 0)
            return 0;
        if (n % 2 != 0)
            return alternateSum(n - 1) + n;
        return alternateSum(n - 1) - n;
    }

    public static void main(String[] args) {
        // First K multiples
        multiples(12, 5);

        // Alternate sign sum
        System.out.println("\nAlternate sign sum: " + alternateSum(10));
    }
}
