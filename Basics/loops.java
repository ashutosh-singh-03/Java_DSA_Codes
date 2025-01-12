import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print "Hello World" n times
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        // Print all nos. from 1 to n which are divisible by both 5 and 3
        System.out.println("-----");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + " ");
        }

        // Print table of m
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(m + " * " + i + " = " + (i * m));
        }

        // Print an AP
        // Method - 1
        System.out.print("Enter the first term: ");
        int a = sc.nextInt();
        System.out.print("Enter the number of terms: ");
        int k = sc.nextInt();
        System.out.print("Enter the common difference: ");
        int d = sc.nextInt();

        for (int i = a; i <= (a + (k - 1) * d); i += d) {
            System.out.print(i + " ");
        }

        // Method - 2 - without maths
        System.out.print("\nEnter the value: ");
        int l = sc.nextInt();

        for (int i = 1; i <= l; i++) {
            System.out.print(a + " ");
            a += d;
        }

        // Displaying the GP
        // Method 1 - Maths formulae
        // last term - a * r ^ (n - 1)
        System.out.print("\nEnter the first term: ");
        int firstTerm = sc.nextInt();
        System.out.print("Enter the common ratio: ");
        int r = sc.nextInt();
        int currentTerm = firstTerm;

        for (int i = 1; i <= k; i++) {
            System.out.print(currentTerm + " ");
            currentTerm *= r;
        }

        // Method 2 - without maths formula
        System.out.println();
        for (int i = 1; i <= k; i++) {
            System.out.print(firstTerm + " ");
            firstTerm *= r;
        }

        // use of break keyword
        // Finding if the number is composite or not
        System.out.print("\nEnter any number: ");
        int num = sc.nextInt();

        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                System.out.println(num + " is Composite.");
                break;
            } else{
                System.out.println(num + " is Prime.");
                break;
            }
        }

        // Checking if number is prime or not
        System.out.print("\nEnter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i <= num - 1; i++){
            if(number % i == 0){
                System.out.println(number + " is Composite.");
                isPrime = false;
                break;
            }
        }
        if(isPrime == true) System.out.println(number + " is Prime.");
        sc.close();
    }
}