package datastructure.class_problems;

import java.util.Scanner;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double average() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    String grade(double avg) {
        if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 40) return "D";
        else return "F";
    }

    void display() {
        double avg = average();
        System.out.println(name.toUpperCase() + ": Average "
                + String.format("%.1f", avg) + ", Grade " + grade(avg));
    }
}

public class StudentResultCardGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int[] marks = new int[3];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        Student student = new Student(name, marks);
        student.display();

        sc.close();
    }
}