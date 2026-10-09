
package polymorphism.assigment_problems;

import java.util.Scanner;

public class ParcelShippingDesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double weight = sc.nextDouble();
            double value = sc.nextDouble();

            double charge = 0;
            double insurance = 0;

            switch (type) {
                case "STANDARD":
                    charge = 40 + (10 * weight);
                    break;

                case "EXPRESS":
                    charge = 80 + (15 * weight);
                    insurance = value * 0.02;
                    break;

                case "FRAGILE":
                    charge = 40 + (10 * weight) + 50;
                    insurance = value * 0.02;
                    break;
            }

            double total = charge + insurance;

            System.out.printf("Charge: %.2f%n", charge);
            System.out.printf("Insurance: %.2f%n", insurance);
            System.out.printf("Total: %.2f%n", total);

            grandTotal += total;
        }

        System.out.printf("Grand Total: %.2f%n", grandTotal);
        sc.close();
    }
}