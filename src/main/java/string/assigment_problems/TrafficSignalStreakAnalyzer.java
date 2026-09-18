package string.assigment_problems;

import java.util.Scanner;

public class TrafficSignalStreakAnalyzer {

    static int longestStreak(String signals) {
        int currentStreak = 0;
        int longestStreak = 0;

        for (int i = 0; i < signals.length(); i++) {
            if (signals.charAt(i) == 'G') {
                currentStreak++;

                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic signal sequence: ");
        String signals = sc.nextLine().toUpperCase();

        System.out.println("Longest green signal streak: " + longestStreak(signals));

        sc.close();
    }
}