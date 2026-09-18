package string.assigment_problems;

import java.util.Scanner;

public class WarehouseInventoryBalancer {

    static int calculateBalance(int[] inventory) {
        int total = 0;

        for (int quantity : inventory) {
            total += quantity;
        }

        return total;
    }

    static int findMaximum(int[] inventory) {
        int maximum = inventory[0];

        for (int quantity : inventory) {
            if (quantity > maximum) {
                maximum = quantity;
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] inventory = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter quantity for product " + (i + 1) + ": ");
            inventory[i] = sc.nextInt();
        }

        System.out.println("Total inventory: " + calculateBalance(inventory));
        System.out.println("Maximum inventory: " + findMaximum(inventory));

        sc.close();
    }
}