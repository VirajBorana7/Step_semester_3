import java.util.Scanner;

public class ExamHallSeatDuplicationChecker {

    static boolean hasDuplicate(int[] seats) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = i + 1; j < seats.length; j++) {
                if (seats[i] == seats[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();

        int[] seats = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter seat number " + (i + 1) + ": ");
            seats[i] = sc.nextInt();
        }

        if (hasDuplicate(seats)) {
            System.out.println("Duplicate seat number found");
        } else {
            System.out.println("No duplicate seat numbers");
        }

        sc.close();
    }
}