package array.class_problems;

import java.util.Arrays;
import java.util.Scanner;

class Candidate implements Comparable<Candidate> {

    String name;
    double cgpa;
    int codingScore;
    double score;

    Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
        this.score = cgpa * 10 + codingScore;
    }

    boolean isEligible(double cgpa) {
        return this.cgpa >= cgpa;
    }

    boolean isEligible(double cgpa, int codingScore) {
        return this.cgpa >= cgpa && this.codingScore >= codingScore;
    }

    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.score, this.score);
    }

    @Override
    public String toString() {
        return name + " - " + score;
    }
}

public class PlacementDriveShortlistingRankingEngine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of candidates: ");
        int n = sc.nextInt();
        sc.nextLine();

        Candidate[] candidates = new Candidate[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter candidate name: ");
            String name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            double cgpa = sc.nextDouble();

            System.out.print("Enter coding score: ");
            int codingScore = sc.nextInt();
            sc.nextLine();

            candidates[i] = new Candidate(name, cgpa, codingScore);
        }

        System.out.print("Enter minimum CGPA: ");
        double minCgpa = sc.nextDouble();

        System.out.print("Enter minimum coding score: ");
        int minCodingScore = sc.nextInt();

        Candidate[] shortlisted = new Candidate[n];
        int count = 0;

        for (Candidate candidate : candidates) {
            if (candidate.isEligible(minCgpa, minCodingScore)) {
                shortlisted[count] = candidate;
                count++;
            }
        }

        shortlisted = Arrays.copyOf(shortlisted, count);
        Arrays.sort(shortlisted);

        System.out.println("Shortlisted Candidates:");

        for (Candidate candidate : shortlisted) {
            System.out.println(candidate);
        }

        sc.close();
    }
}