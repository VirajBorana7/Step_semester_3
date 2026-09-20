package oop.class_problems;

import java.util.Scanner;

class Attendance {
    private final String[] presentStudents;
    private int count;

    public Attendance(int maxSize) {
        presentStudents = new String[maxSize];
        count = 0;
    }

    public void markPresent(String name) {
        if (isPresent(name)) {
            return;
        }

        if (count < presentStudents.length) {
            presentStudents[count] = name;
            count++;
        }
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (presentStudents[i].equals(name)) {
                return true;
            }
        }

        return false;
    }
}

public class AttendanceSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum class size: ");
        int maxSize = sc.nextInt();
        sc.nextLine();

        Attendance attendance = new Attendance(maxSize);

        System.out.print("Enter number of students to mark present: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            attendance.markPresent(name);
        }

        System.out.println("Present Count: " + attendance.getPresentCount());

        System.out.print("Enter name to check: ");
        String searchName = sc.nextLine();

        System.out.println("Is Present: " + attendance.isPresent(searchName));

        sc.close();
    }
}