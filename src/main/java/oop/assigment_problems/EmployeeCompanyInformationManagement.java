package oop.assigment_problems;

import java.util.Scanner;

class Employee {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class EmployeeCompanyInformationManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter first employee salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter second employee salary: ");
        double salary2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter third employee name: ");
        String name3 = sc.nextLine();

        System.out.print("Enter third employee salary: ");
        double salary3 = sc.nextDouble();

        Employee employee1 = new Employee(name1, salary1);
        Employee employee2 = new Employee(name2, salary2);
        Employee employee3 = new Employee(name3, salary3);

        Employee.printCompanyInfo();

        sc.close();
    }
}