package Strings;

import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        StringBuilder str = new StringBuilder(sc.nextLine());

        System.out.println("String: " + str);
        System.out.println("Reverse String: " + str.reverse());

        // setCharAt()
        str.setCharAt(1, 'z');
        System.out.println(str);

        sc.close();
    }
}
