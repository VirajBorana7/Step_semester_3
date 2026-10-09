package polymorphism.class_problems;

import java.util.Scanner;

interface Billable {
    double calculateBill();
}

class FoodItem implements Billable {
    private String name;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateBill() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }
}

public class CanteenBillingCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        FoodItem[] items = new FoodItem[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            String name = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            items[i] = new FoodItem(name, price, quantity);
        }

        for (FoodItem item : items) {
            double bill = item.calculateBill();
            System.out.printf("%s: %.2f%n", item.getName(), bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}