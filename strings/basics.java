package strings;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ashutosh Singh");
        // Ashu
        char[] ch = { 'A', 's', 'h', 'u' };
        for (char c : ch) {
            System.out.print(c);
        }

        // Variable to store string
        String s = "Ashutosh Singh";
        System.out.println("\n" + s);

        // Taking Input
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        String fullName = sc.next();

        System.out.print("\nFirst Name: " + fullName);
        System.out.print("\nFull Name: " + name);

        // charAt() and length()
        System.out.println("\nFirst Letter: " + name.charAt(0));
        System.out.println("Length of name: " + name.length());

        sc.close();
    }
}
