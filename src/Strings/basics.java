package Strings;

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

        // indexOf(), lastIndexOf(), compareTo()
        System.out.print("\nIndex of S: " + fullName.indexOf('A'));
        System.out.print("\nFirst Occurrence of s: " + name.indexOf('s'));
        System.out.print("\nIndex of S: " + name.lastIndexOf('s'));

        System.out.println("Using compareTo() function: ");
        // different comparisons
        // same strings
        String s1 = "abc";
        String s2 = "abc";
        System.out.print("\nSame Strings: " + s1.compareTo(s2));
        // different strings - starting index is different
        String s3 = "abc";
        String s4 = "dbc";
        System.out.print("\ndifferent strings when starting index is different: " + s3.compareTo(s4));
        // different strings - last index is different
        String s5 = "dbe";
        String s6 = "dbc";
        System.out.print("\ndifferent strings when last index is different: " + s5.compareTo(s6));
        // difference in length && same string - of 1st string
        String s7 = "dbcaa";
        String s8 = "dbc";
        System.out.print("\ndifference in length && same string (of 1st string): " + s7.compareTo(s8));
        // difference in length && same string - of 2nd string
        String s9 = "dbc";
        String s10 = "dbcaa";
        System.out.print("\ndifference in length && same string (of 2nd string): " + s9.compareTo(s10));
        // difference in length && different string - of 2nd string
        String s11 = "abcaa";
        String s12 = "dbc";
        System.out.print("\ndifference in length && different string (of 2nd string): " + s11.compareTo(s12));

        // startsWith() && contains()
        System.out.print("\nStarts With: " + fullName.startsWith("Ashu"));
        System.out.print("\nEnds With: " + fullName.endsWith("gh"));
        System.out.print("\nContains: " + fullName.contains("Ashu"));

        // toLowerCase() && toUpperCase() && concat()
        System.out.print("\nLower Case: " + fullName.toLowerCase());
        System.out.print("\nUpper Case: " + fullName.toUpperCase());
        System.out.print("\nConcatenation: " + name.concat(fullName));

        // substring(i) && substring(i,j)
        System.out.print("\nSubstring 1: " + name.substring(2));
        System.out.print("\nSubstring 2: " + name.substring(2, name.length() - 2));
        sc.close();
    }
}
