
package abstraction.assigment_problems;

import java.util.Scanner;

abstract class Plot {
    String owner;

    Plot(String owner) {
        this.owner = owner;
    }

    abstract double calculateArea();
}

class Circle extends Plot {
    double radius;

    Circle(String owner, double radius) {
        super(owner);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Plot {
    double length, width;

    Rectangle(String owner, double length, double width) {
        super(owner);
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Plot {
    double base, height;

    Triangle(String owner, double base, double height) {
        super(owner);
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class GardenPlotAreaReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Plot[] plots = new Plot[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            String owner = sc.next();

            switch (type) {
                case "CIRCLE":
                    plots[i] = new Circle(owner, sc.nextDouble());
                    break;
                case "RECTANGLE":
                    plots[i] = new Rectangle(owner, sc.nextDouble(), sc.nextDouble());
                    break;
                case "TRIANGLE":
                    plots[i] = new Triangle(owner, sc.nextDouble(), sc.nextDouble());
                    break;
            }
        }

        double total = 0;

        for (Plot plot : plots) {
            double area = plot.calculateArea();
            System.out.printf("%s (%s): %.2f%n",
                plot.owner, plot.getClass().getSimpleName().toUpperCase(), area);
            total += area;
        }

        System.out.printf("Total Area: %.2f%n", total);
        sc.close();
    }
}