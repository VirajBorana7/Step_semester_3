package string.assigment_problems;

import java.util.Scanner;

public class ATMPINLengthValidator {

    static boolean isValidPIN(String pin) {
        return pin.length() == 4 || pin.length() == 6;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ATM PIN: ");
        String pin = sc.nextLine();

        if (isValidPIN(pin)) {
            System.out.println("Valid PIN");
        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}
