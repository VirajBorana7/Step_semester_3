
package polymorphism.assigment_problems;

import java.util.Scanner;

public class CollegeFeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double totalFees = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String type = sc.next().toUpperCase();

            double fees = 0;

            switch (type) {
                case "DAY":
                    fees = 40000 + 12000;
                    break;

                case "HOSTELLER":
                    fees = 40000 + 60000;
                    break;

                case "SCHOLARSHIP":
                    fees = 20000 + 12000;
                    break;
            }

            System.out.printf("%s: %.2f%n", name, fees);
            totalFees += fees;
        }

        System.out.printf("Total Fees: %.2f%n", totalFees);
        sc.close();
    }
}