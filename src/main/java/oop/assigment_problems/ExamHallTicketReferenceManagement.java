package oop.assigment_problems;

import java.util.Scanner;

class HallTicket {

    String studentName;
    int seatNumber;

    HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

public class ExamHallTicketReferenceManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter initial seat number: ");
        int seatNumber = sc.nextInt();

        HallTicket priya = new HallTicket(studentName, seatNumber);

        HallTicket copy = priya;

        System.out.print("Enter updated seat number: ");
        copy.seatNumber = sc.nextInt();

        HallTicket separate = new HallTicket(studentName, copy.seatNumber);

        System.out.println(studentName + "'s seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));
        System.out.println("separate == priya: " + (separate == priya));

        sc.close();
    }
}