import java.util.*;

public class primeComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if (num <= 1)
            System.out.println("Neither Prime nor Composite.");
        else {
            boolean isComposite = false;
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite)
                System.out.println(num + " is Prime.");
            else
                System.out.println(num + " is Composite.");
        }
        sc.close();
    }
}
