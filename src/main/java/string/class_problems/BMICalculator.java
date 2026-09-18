import java.util.Scanner;

public class BMICalculator {

    static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    static String getCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of team members: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter weight in kg for member " + i + ": ");
            double weight = sc.nextDouble();

            System.out.print("Enter height in meters for member " + i + ": ");
            double height = sc.nextDouble();

            double bmi = calculateBMI(weight, height);

            System.out.printf("BMI: %.2f%n", bmi);
            System.out.println("Category: " + getCategory(bmi));
        }

        sc.close();
    }
}