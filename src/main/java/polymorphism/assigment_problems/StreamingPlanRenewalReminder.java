
package polymorphism.assigment_problems;

import java.util.Scanner;
import java.time.LocalDate;

public class StreamingPlanRenewalReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String plan = sc.next().toUpperCase();
            String name = sc.next();
            LocalDate startDate = LocalDate.parse(sc.next());

            int days = 0;

            switch (plan) {
                case "BASIC":
                    days = 30;
                    break;

                case "STANDARD":
                    days = 90;
                    break;

                case "PREMIUM":
                    days = 365;
                    break;
            }

            LocalDate renewalDate = startDate.plusDays(days);
            System.out.println(name + ": " + renewalDate);
        }

        sc.close();
    }
}