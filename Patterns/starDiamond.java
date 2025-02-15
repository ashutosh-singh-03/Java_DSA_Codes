package Patterns;

public class starDiamond {
    public static void main(String[] args) {
        int n = 4, nsp = n - 1, nst = 1;
        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= nsp; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) { // stars
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }

        nsp = 1;
        nst -= 4;
        for (int i = 1; i <= n - 1; i++) { // rows
            for (int j = 1; j <= nsp; j++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) { // stars
                System.out.print("* ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }
    }
}
