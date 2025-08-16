package Recursion_Basics;

public class multiplication {
    static int multiply(int a, int b) { // O(b) complexity
        if (b == 0)
            return 0;
        if (b < 0)
            return -multiply(a, -b); // handle negative numbers
        return multiply(a, b - 1) + a;
    }

    static int optimizedMulti(int a, int b) { // log b complexity
        if (b == 0)
            return 0;
        if (b < 0)
            return -optimizedMulti(a, -b);

        if (b % 2 == 0)
            return optimizedMulti(a + a, b / 2); // 2 * (a * (b/2))
        return optimizedMulti(a, b - 1) + a;
    }

    public static void main(String[] args) {
        System.out.println(multiply(4, -5));
    }
}
