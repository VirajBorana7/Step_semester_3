package string.class_problems;

import java.util.Scanner;

public class CSVStudentRecordParser {

    static void parseRecord(String record) {
        String[] data = record.split(",");

        System.out.println("Name: " + data[0].trim());
        System.out.println("Age: " + data[1].trim());
        System.out.println("Course: " + data[2].trim());
        System.out.println("Marks: " + data[3].trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student record: ");
        String record = sc.nextLine();

        parseRecord(record);

        sc.close();
    }
}