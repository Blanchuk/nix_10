package ua.com.alevel;

import java.util.Scanner;

import static ua.com.alevel.NumberUtil.readInteger;

public class BaseOperationsMain {

    private static final Lessons lessons = new Lessons();
    private static final Letters letters = new Letters();
    private static final SumNumbers sumNumbers = new SumNumbers();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Enter 1 to select the first task");
        System.out.println("Enter 2 to select the second task");
        System.out.println("Enter 3 to select the third task");
        System.out.println("Enter 0 to exit");
        while (!exit) {
            Integer str = readInteger(in, "Choose a task: ");
            switch (str) {
                case 1 -> sumNumbers.sum();
                case 2 -> letters.count();
                case 3 -> lessons.startLesson();
                case 0 -> exit = true;
            }
        }
        System.out.println("Thank you for your time!!!");
    }
}

