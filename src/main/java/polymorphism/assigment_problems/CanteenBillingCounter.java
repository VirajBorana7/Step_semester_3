
package polymorphism.assigment_problems;

import java.util.Scanner;

abstract class CustomerBill {
    double amount;

    CustomerBill(double amount) {
        this.amount = amount;
    }

    abstract double calculateAmount();
}

class StudentBill extends CustomerBill {
    StudentBill(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount * 0.90;
    }
}

class StaffBill extends CustomerBill {
    StaffBill(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount * 0.95;
    }
}

class GuestBill extends CustomerBill {
    GuestBill(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount + 10;
    }
}

public class CanteenBillingCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        CustomerBill[] bills = new CustomerBill[n];
        String[] types = new String[n];

        for (int i = 0; i < n; i++) {
            types[i] = sc.next().toUpperCase();
            double amount = sc.nextDouble();

            switch (types[i]) {
                case "STUDENT":
                    bills[i] = new StudentBill(amount);
                    break;
                case "STAFF":
                    bills[i] = new StaffBill(amount);
                    break;
                case "GUEST":
                    bills[i] = new GuestBill(amount);
                    break;
            }
        }

        double total = 0;

        for (int i = 0; i < n; i++) {
            double finalAmount = bills[i].calculateAmount();
            System.out.printf("%s: %.2f%n", types[i], finalAmount);
            total += finalAmount;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}