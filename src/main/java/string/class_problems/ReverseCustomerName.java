import java.util.Scanner;

public class ReverseCustomerName {

    static String reverseName(String name) {
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.println("Reversed name: " + reverseName(name));

        sc.close();
    }
}