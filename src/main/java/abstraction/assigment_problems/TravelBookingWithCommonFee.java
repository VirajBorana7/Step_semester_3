
package abstraction.assigment_problems;

import java.util.Scanner;

abstract class Booking {
    double distance;

    Booking(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    double totalFare() {
        return calculateFare() + 50;
    }
}

class Bus extends Booking {
    Bus(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 2.0;
    }
}

class Train extends Booking {
    Train(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 1.5;
    }
}

class Flight extends Booking {
    Flight(double distance) {
        super(distance);
    }

    double calculateFare() {
        return 2500 + distance * 4.0;
    }
}

public class TravelBookingWithCommonFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Booking[] bookings = new Booking[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double distance = sc.nextDouble();

            switch (type) {
                case "BUS":
                    bookings[i] = new Bus(distance);
                    break;
                case "TRAIN":
                    bookings[i] = new Train(distance);
                    break;
                case "FLIGHT":
                    bookings[i] = new Flight(distance);
                    break;
            }
        }

        double total = 0;

        for (Booking booking : bookings) {
            double fare = booking.totalFare();
            System.out.printf("%s: %.2f%n",
                booking.getClass().getSimpleName().toUpperCase(), fare);
            total += fare;
        }

        System.out.printf("Total Fare: %.2f%n", total);
        sc.close();
    }
}