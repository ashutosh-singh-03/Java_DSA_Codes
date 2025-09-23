package Basics.Conditionals;

import java.util.Scanner;

public class profitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Cost Price of the item: ");
        int CP = sc.nextInt();
        System.out.print("Enter the Selling Price of the item: ");
        int SP = sc.nextInt();
        if (CP > SP) System.out.println("Loss.\nLoss Amount: " + (CP - SP));
        else if (CP == SP) System.out.println("No Profit No Loss.");
        else System.out.println("Profit.\nProfit Amount: " + (SP - CP));

        sc.close();
    }
}