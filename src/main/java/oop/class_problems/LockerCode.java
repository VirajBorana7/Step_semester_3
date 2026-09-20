package oop.class_problems;

import java.util.Scanner;

class Locker {
    private String combination;
    private final int lockerNumber;

    public Locker(int lockerNumber, String combination) {
        this.lockerNumber = lockerNumber;
        this.combination = combination;
    }

    public void changeCode(String currentCode, String newCode) {
        if (combination.equals(currentCode)) {
            combination = newCode;
            System.out.println("Code changed successfully");
        } else {
            System.out.println("Code change rejected");
        }
    }

    public int getLockerNumber() {
        return lockerNumber;
    }
}

public class LockerCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter locker number: ");
        int lockerNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter initial code: ");
        String initialCode = sc.nextLine();

        Locker locker = new Locker(lockerNumber, initialCode);

        System.out.print("Enter current code: ");
        String currentCode = sc.nextLine();

        System.out.print("Enter new code: ");
        String newCode = sc.nextLine();

        locker.changeCode(currentCode, newCode);

        System.out.println("Locker Number: " + locker.getLockerNumber());

        sc.close();
    }
}