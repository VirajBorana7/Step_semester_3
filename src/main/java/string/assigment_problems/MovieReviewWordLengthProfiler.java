package string.assigment_problems;

import java.util.Scanner;

public class MovieReviewWordLengthProfiler {

    static void analyzeWords(String review) {
        String[] words = review.split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (String word : words) {
            int length = word.length();

            if (length <= 3) {
                shortWords++;
            } else if (length <= 6) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("Short words: " + shortWords);
        System.out.println("Medium words: " + mediumWords);
        System.out.println("Long words: " + longWords);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = sc.nextLine();

        analyzeWords(review);

        sc.close();
    }
}