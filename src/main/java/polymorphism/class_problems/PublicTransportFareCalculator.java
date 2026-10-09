
package polymorphism.class_problems;

import java.util.Scanner;

public class PublicTransportFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double distance = sc.nextDouble();
            double fare = 0;

            switch (type) {
                case "BUS":
                    fare = 2 + (0.10 * distance);
                    if (fare > 10) {
                        fare = 10;
                    }
                    break;

                case "TRAIN":
                    fare = 3 + (0.15 * distance);
                    break;

                case "METRO":
                    double peakHourFactor = sc.nextDouble();
                    fare = (1.50 + (0.20 * distance))
                            * peakHourFactor;
                    break;
            }

            System.out.printf("%s: %.2f%n", type, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}