package oop.assigment_problems;

import java.util.Scanner;

class Light {
    private String color;
    private final String id;

    public Light(String id) {
        this.id = id;
        this.color = "RED";
    }

    public void next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else {
            color = "RED";
        }
    }

    public String getColor() {
        return color;
    }

    public String getId() {
        return id;
    }
}

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light ID: ");
        String id = sc.nextLine();

        Light light = new Light(id);

        System.out.println("Current Color: " + light.getColor());

        System.out.print("Enter number of times to change: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            light.next();
            System.out.println("Current Color: " + light.getColor());
        }

        System.out.println("Traffic Light ID: " + light.getId());

        sc.close();
    }
}