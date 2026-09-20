package oop.class_problems;

import java.util.Scanner;

class PiggyBankAccount {
    private double savings;
    private final String id;

    public PiggyBankAccount(String id) {
        this.id = id;
        this.savings = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            savings += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > savings) {
            System.out.println("Withdrawal rejected");
        } else if (amount > 0) {
            savings -= amount;
        }
    }

    public double getSavings() {
        return savings;
    }

    public String getId() {
        return id;
    }
}

public class PiggyBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Piggy Bank ID: ");
        String id = sc.nextLine();

        PiggyBankAccount pb = new PiggyBankAccount(id);

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        pb.deposit(deposit);

        System.out.print("Enter withdrawal amount: ");
        double withdrawal = sc.nextDouble();
        pb.withdraw(withdrawal);

        System.out.println("Piggy Bank ID: " + pb.getId());
        System.out.println("Current Savings: " + pb.getSavings());

        sc.close();
    }
}