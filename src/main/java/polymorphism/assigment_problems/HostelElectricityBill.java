
package polymorphism.assigment_problems;

import java.util.Scanner;

abstract class Room {
    double units;

    Room(double units) {
        this.units = units;
    }

    abstract double calculateBill();
}

class SingleRoom extends Room {
    SingleRoom(double units) {
        super(units);
    }

    double calculateBill() {
        return units * 8;
    }
}

class SharedRoom extends Room {
    int occupants;

    SharedRoom(double units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    double calculateBill() {
        return (units * 6) / occupants;
    }
}

class ACRoom extends Room {
    ACRoom(double units) {
        super(units);
    }

    double calculateBill() {
        return units * 10 + 200;
    }
}

public class HostelElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Room[] rooms = new Room[n];
        String[] types = new String[n];

        for (int i = 0; i < n; i++) {
            types[i] = sc.next().toUpperCase();
            double units = sc.nextDouble();

            switch (types[i]) {
                case "SINGLE":
                    rooms[i] = new SingleRoom(units);
                    break;

                case "SHARED":
                    int occupants = sc.nextInt();
                    rooms[i] = new SharedRoom(units, occupants);
                    break;

                case "AC":
                    rooms[i] = new ACRoom(units);
                    break;
            }
        }

        double total = 0;

        for (int i = 0; i < n; i++) {
            double bill = rooms[i].calculateBill();
            System.out.printf("%s: %.2f%n", types[i], bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}