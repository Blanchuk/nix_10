package ua.com.alevel.levelone;

import java.util.Scanner;

import static ua.com.alevel.NumberUtil.readInteger;

public class KnightsMove {

    public void move() {
        Scanner in = new Scanner(System.in);
        Integer x = readInteger(in, "Enter starting position at x: ");
        Integer y = readInteger(in, "Enter starting position at y: ");
        Integer move_x = readInteger(in, "Enter the desired position at X: ");
        Integer move_y = readInteger(in, "Enter the desired position at Y: ");
        int dx = Math.abs(x - move_x);
        int dy = Math.abs(y - move_y);
        if (dx == 1 && dy == 2 || dx == 2 && dy == 1) {
            System.out.println("Move possible");
        } else {
            System.out.println("No move possible");
        }
    }
}
