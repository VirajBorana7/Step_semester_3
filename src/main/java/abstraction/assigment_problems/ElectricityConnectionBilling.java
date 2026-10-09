
package abstraction.assigment_problems;

import java.util.Scanner;

abstract class Connection {
    int units;

    Connection(int units) {
        this.units = units;
    }

    abstract double calculateBill();
}

class Home extends Connection {
    Home(int units) {
        super(units);
    }

    double calculateBill() {
        if (units <= 100) {
            return units * 5.0;
        }
        return 500 + (units - 100) * 7.0;
    }
}

class Shop extends Connection {
    Shop(int units) {
        super(units);
    }

    double calculateBill() {
        return units * 8.0 + 100;
    }
}

class Factory extends Connection {
    Factory(int units) {
        super(units);
    }

    double calculateBill() {
        return Math.max(units * 6.0, 1000.0);
    }
}

public class ElectricityConnectionBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Connection[] connections = new Connection[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            int units = sc.nextInt();

            switch (type) {
                case "HOME":
                    connections[i] = new Home(units);
                    break;
                case "SHOP":
                    connections[i] = new Shop(units);
                    break;
                case "FACTORY":
                    connections[i] = new Factory(units);
                    break;
            }
        }

        double total = 0;

        for (Connection connection : connections) {
            double bill = connection.calculateBill();
            System.out.printf("%s: %.2f%n",
                connection.getClass().getSimpleName().toUpperCase(), bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}