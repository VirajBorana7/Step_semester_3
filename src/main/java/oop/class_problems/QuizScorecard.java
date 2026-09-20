package oop.class_problems;

import java.util.Scanner;

class Scorecard {
    private final boolean[] results;
    private int answerCount;

    public Scorecard(int questionCount) {
        results = new boolean[questionCount];
        answerCount = 0;
    }

    public void recordAnswer(boolean correct) {
        if (answerCount < results.length) {
            results[answerCount] = correct;
            answerCount++;
        } else {
            System.out.println("Cannot record more answers");
        }
    }

    public int getScore() {
        int score = 0;

        for (int i = 0; i < answerCount; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }
}

public class QuizScorecard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of questions: ");
        int n = sc.nextInt();

        Scorecard scorecard = new Scorecard(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter result for question " + (i + 1) + " (true/false): ");
            boolean result = sc.nextBoolean();
            scorecard.recordAnswer(result);
        }

        System.out.println("Final Score: " + scorecard.getScore());

        sc.close();
    }
}