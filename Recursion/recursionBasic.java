public class recursionBasic {
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n);
    }

    public static void printDecreasing(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n);
        printIncreasing(n - 1);
    }

    public static void main(String[] args) {
        // to print all the natural nos from 1 to n using recursion
        System.out.println("1 to n: ");
        printIncreasing(5);

        // to print all the natural nos from n to 1 using recursion
        System.out.println("\nn to 1: ");
        printDecreasing(5);
    }
}