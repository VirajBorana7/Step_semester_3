package oop.assigment_problems;

import java.util.Scanner;

class Employee {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }
}

public class EmployeeProfileCreation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter permanent employee ID: ");
        String permanentId = sc.nextLine();

        System.out.print("Enter permanent employee name: ");
        String permanentName = sc.nextLine();

        System.out.print("Enter permanent employee salary: ");
        double permanentSalary = sc.nextDouble();
        sc.nextLine();

        Employee permanent = new Employee(permanentId, permanentName, permanentSalary);

        System.out.print("Enter intern employee ID: ");
        String internId = sc.nextLine();

        System.out.print("Enter intern employee name: ");
        String internName = sc.nextLine();

        Employee intern = new Employee(internId, internName);

        permanent.printProfile();
        intern.printProfile();

        sc.close();
    }
}