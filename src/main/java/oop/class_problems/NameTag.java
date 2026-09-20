package oop.class_problems;

import java.util.Scanner;

class ImmutableNameTag {
    private final String firstName;
    private final String lastName;

    public ImmutableNameTag(String fullName) {
        String[] parts = fullName.split(" ");
        firstName = parts[0];
        lastName = parts[1];
    }

    public String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }
}

public class NameTag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = sc.nextLine();

        ImmutableNameTag tag = new ImmutableNameTag(fullName);

        System.out.println("Nickname: " + tag.getNickname());

        sc.close();
    }
}