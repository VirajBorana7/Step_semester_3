package string.class_problems;

import java.util.Scanner;

public class FileExtensionValidator {

    static boolean isValidExtension(String fileName) {
        String lowerName = fileName.toLowerCase();

        return lowerName.endsWith(".jpg") ||
               lowerName.endsWith(".png") ||
               lowerName.endsWith(".pdf") ||
               lowerName.endsWith(".txt");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        if (isValidExtension(fileName)) {
            System.out.println("Valid file extension");
        } else {
            System.out.println("Invalid file extension");
        }

        sc.close();
    }
}