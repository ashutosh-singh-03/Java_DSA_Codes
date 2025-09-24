package Methods;

import java.util.Scanner;

//Take n and r as input and get permutation and combination
public class permutationAndCombination {
    public static int factorial(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of R: ");
        int r = sc.nextInt();

        if (r > n) System.out.println("R should be less than N.");
        else {
            int comb = factorial(n) / (factorial(r) * factorial(n - r));
            System.out.println("Combination: " + comb);
            int perm = factorial(n) / factorial(n - r);
            System.out.println("Permutation: " + perm);
        }
    }
}