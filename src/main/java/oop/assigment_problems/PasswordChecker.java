package oop.assigment_problems;

import java.util.Scanner;

class Password {
    private final String password;

    public Password(String password) {
        this.password = password;
    }

    public String getStrength() {
        if (password.length() < 6) {
            return "Weak";
        } else if (password.length() <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
}

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        Password checker = new Password(password);

        System.out.println("Password Strength: " + checker.getStrength());

        sc.close();
    }
}