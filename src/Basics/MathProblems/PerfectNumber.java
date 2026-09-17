package Basics.MathProblems;

// Perfect Number -- whose sum of proper divisor is equal to number itself. Ex = 6 : 1+2+3 = 6
public class PerfectNumber {
    public static Boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                int secondFactor = num / i; // as the first factor is 'i'
                sum += i + secondFactor;
            }
        }
        return sum == num;
    }

    public static void main() {
        int num = 28;
        System.out.println(isPerfect(num));
    }
}
