import java.util.Scanner;

public class basicCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // to give absolute value of number
        System.out.print("Enter a number to get absolute: ");
        int num1 = sc.nextInt();
        if (num1 < 0)
            num1 = -num1;
        System.out.println(num1);

        // to take double as input and check if it's an integer, 6.0 - int && 6.9 -
        // double
        System.out.println("Enter a double value: ");
        double x = sc.nextDouble();
        if (x - (int) x > 0)
            System.out.println("Is not Integer.");
        else
            System.out.println("Is Integer.");

        sc.close();
    }
}
