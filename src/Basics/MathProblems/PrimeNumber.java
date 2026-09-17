package Basics.MathProblems;

/*
1. Check if the number is Prime
2. Print all the Prime Numbers (1 to N)
*/
public class PrimeNumber {
    public static Boolean isPrime(int num) {
        if (num < 0) {
            System.out.println("Enter Positive Number");
            return false;
        } else if (num == 0 || num == 1) {
            System.out.println("0 1 are Neither Prime nor Composite");
            return false;
        }
        for (int i = 2; i <= Math.pow(num, 0.5); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void getAllPrimeNum(int num) {
        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    public static void main() {
        int num = 78;
        int limit = 100;

        System.out.println(num + " is Prime: " + isPrime(num));
        getAllPrimeNum(limit);
    }
}
