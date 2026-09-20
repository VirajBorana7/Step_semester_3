package oop.class_problems;

import java.util.Scanner;

class Course {

    String code;
    String title;
    int credits;
    int labCredits;

    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    public int totalCredits() {
        return credits + labCredits;
    }
}

public class CourseCreditManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory course code: ");
        String theoryCode = sc.nextLine();

        System.out.print("Enter theory course title: ");
        String theoryTitle = sc.nextLine();

        System.out.print("Enter theory credits: ");
        int theoryCredits = sc.nextInt();
        sc.nextLine();

        Course theoryCourse = new Course(theoryCode, theoryTitle, theoryCredits);

        System.out.print("Enter lab course code: ");
        String labCode = sc.nextLine();

        System.out.print("Enter lab course title: ");
        String labTitle = sc.nextLine();

        System.out.print("Enter course credits: ");
        int courseCredits = sc.nextInt();

        System.out.print("Enter lab credits: ");
        int labCredits = sc.nextInt();

        Course labCourse = new Course(labCode, labTitle, courseCredits, labCredits);

        System.out.println(theoryCode + " total credits: " + theoryCourse.totalCredits());
        System.out.println(labCode + " total credits: " + labCourse.totalCredits());

        sc.close();
    }
}