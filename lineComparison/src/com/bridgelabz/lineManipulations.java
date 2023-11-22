package com.bridgelabz;

import java.util.Scanner;

public class lineManipulations {
    private double x1, y1, x2, y2;
    public lineManipulations(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * @name: calculateLength
     * @return/ o/p: length of line using distance formula..
     */
    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x1 x2 : ");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();

        System.out.print("y1 y2 : ");
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        lineManipulations line = new lineManipulations(x1, y1, x2, y2);
        double length = line.calculateLength();
        System.out.println("Length of the line: " + length);
        scanner.close();
    }
}
