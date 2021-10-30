package ua.com.alevel.levelone;

import java.util.Scanner;

import static ua.com.alevel.NumberUtil.readDouble;

public class TriangleArea {

    private static final String ENTER_X = "x = ";
    private static final String ENTER_Y = "Y = ";

    public void findArea() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point: ");
        Double x1 = readDouble(in, ENTER_X);
        Double y1 = readDouble(in, ENTER_Y);
        System.out.println("Enter the coordinates of the second point: ");
        Double x2 = readDouble(in, ENTER_X);
        Double y2 = readDouble(in, ENTER_Y);
        System.out.println("Enter the coordinates of the third point: ");
        Double x3 = readDouble(in, ENTER_X);
        Double y3 = readDouble(in, ENTER_Y);
        double result = Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) * 0.5;
        System.out.println("The area of your triangle: " + result);
    }
}
