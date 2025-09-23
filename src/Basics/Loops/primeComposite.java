package Practice;

import java.util.*;

//if 'i' is a factor of n then 'n/i' will also be a factor of n
public class primeComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (num == 1) System.out.println(num + " is Neither Prime nor Composite.");
        else if (isPrime) System.out.println(num + " is Prime.");
        else System.out.println(num + " is Composite.");
    }
}