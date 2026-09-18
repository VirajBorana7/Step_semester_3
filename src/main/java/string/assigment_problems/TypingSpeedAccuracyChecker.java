package string.assigment_problems;
import java.util.Scanner;

public class TypingSpeedAccuracyChecker {

    static double calculateAccuracy(String expected, String typed) {
        int correct = 0;
        int length = Math.min(expected.length(), typed.length());

        for (int i = 0; i < length; i++) {
            if (expected.charAt(i) == typed.charAt(i)) {
                correct++;
            }
        }

        return (correct * 100.0) / expected.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expected text: ");
        String expected = sc.nextLine();

        System.out.print("Enter typed text: ");
        String typed = sc.nextLine();

        double accuracy = calculateAccuracy(expected, typed);

        System.out.printf("Typing accuracy: %.2f%%%n", accuracy);

        sc.close();
    }
}