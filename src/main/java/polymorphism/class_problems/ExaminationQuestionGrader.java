
package polymorphism.class_problems;

import java.util.Scanner;

public class ExaminationQuestionGrader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        double total = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();

            String type = line.substring(0, line.indexOf(' ')).toUpperCase();

            int firstQuote = line.indexOf('"');
            int secondQuote = line.indexOf('"', firstQuote + 1);
            int thirdQuote = line.indexOf('"', secondQuote + 1);
            int fourthQuote = line.indexOf('"', thirdQuote + 1);
            int fifthQuote = line.indexOf('"', fourthQuote + 1);
            int sixthQuote = line.indexOf('"', fifthQuote + 1);

            String correct = line.substring(thirdQuote + 1, fourthQuote);
            String student = line.substring(fifthQuote + 1, sixthQuote);
            double points = Double.parseDouble(line.substring(sixthQuote + 1).trim());

            double score = 0;

            if (type.equals("MCQ") || type.equals("TF")) {
                if (student.equalsIgnoreCase(correct)) {
                    score = points;
                }
            } else if (type.equals("ESSAY")) {
                String[] keywords = correct.split(",");
                int matches = 0;

                for (String keyword : keywords) {
                    if (student.toLowerCase().contains(
                            keyword.trim().toLowerCase())) {
                        matches++;
                    }
                }

                if (matches >= 2) {
                    score = points * 0.75;
                } else if (matches == 1) {
                    score = points * 0.50;
                }
            }

            System.out.printf("%s: %.2f%n", type, score);
            total += score;
        }

        System.out.printf("Total Score: %.2f%n", total);
        sc.close();
    }
}