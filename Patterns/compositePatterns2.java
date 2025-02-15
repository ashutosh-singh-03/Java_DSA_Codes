package Patterns;
public class compositePatterns2 {
    public static void main(String[] args) {

        // 1. Number Pyramid Pallindrome
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { // spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) { // number pattern
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) { // reverse number pattern
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        // 2. Star Bridge
        n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {// stars
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {// spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= n + 1 - i; j++) {// stars
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        // 3. Number Bridge
        n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= n + 1 - i; j++) {// numbers
                System.out.print(a++ + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {// spaces
                System.out.print("  ");
                a++; // very important
            }
            for (int j = 1; j <= n + 1 - i; j++) {// numbers
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}
