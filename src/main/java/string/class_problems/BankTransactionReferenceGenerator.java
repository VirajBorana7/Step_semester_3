package string.class_problems;

import java.util.Scanner;
import java.util.Random;

public class BankTransactionReferenceGenerator {

    static String generateReference() {
        Random random = new Random();
        int number = 100000 + random.nextInt(900000);

        return "TXN" + number;
    }

    static boolean validateReference(String reference) {
        if (!reference.startsWith("TXN")) {
            return false;
        }

        if (reference.length() != 9) {
            return false;
        }

        for (int i = 3; i < reference.length(); i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String reference = generateReference();

        System.out.println("Generated reference: " + reference);
        System.out.println("Valid reference: " + validateReference(reference));

        System.out.print("Enter a reference to validate: ");
        String input = sc.nextLine();

        System.out.println("Validation result: " + validateReference(input));

        sc.close();
    }
}