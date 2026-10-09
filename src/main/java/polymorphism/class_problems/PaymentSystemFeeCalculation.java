
package polymorphism.class_problems;

import java.util.Scanner;

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract double calculateAmount();
}

class CardPayment extends Payment {
    CardPayment(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount + amount * 0.02;
    }
}

class WalletPayment extends Payment {
    WalletPayment(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount + amount * 0.01;
    }
}

class BankTransfer extends Payment {
    BankTransfer(double amount) {
        super(amount);
    }

    double calculateAmount() {
        return amount;
    }
}

public class PaymentSystemFeeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Payment[] payments = new Payment[n];
        String[] types = new String[n];

        for (int i = 0; i < n; i++) {
            types[i] = sc.next().toUpperCase();
            double amount = sc.nextDouble();

            switch (types[i]) {
                case "CARD":
                    payments[i] = new CardPayment(amount);
                    break;
                case "WALLET":
                    payments[i] = new WalletPayment(amount);
                    break;
                case "BANKTRANSFER":
                    payments[i] = new BankTransfer(amount);
                    break;
            }
        }

        double total = 0;

        for (int i = 0; i < n; i++) {
            double adjusted = payments[i].calculateAmount();
            System.out.printf("%s: %.2f%n", types[i], adjusted);
            total += adjusted;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
