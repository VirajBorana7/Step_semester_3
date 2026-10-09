
package polymorphism.class_problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LibraryItemDueDateCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());
        LocalDate currentDate = LocalDate.of(2023, 10, 26);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            int space = line.indexOf(' ');

            String type = line.substring(0, space).toUpperCase();
            String title = line.substring(space + 1).trim();
            title = title.replaceAll("^\"|\"$", "");

            int days;

            switch (type) {
                case "BOOK":
                    days = 14;
                    break;
                case "DVD":
                    days = 7;
                    break;
                case "MAGAZINE":
                    days = 3;
                    break;
                default:
                    continue;
            }

            LocalDate dueDate = currentDate.plusDays(days);
            System.out.println(title + ": " + dueDate.format(formatter));
        }

        sc.close();
    }
}