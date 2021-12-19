package ua.com.alevel;

import ua.com.alevel.tasks.levelOne.FirstTask;
import ua.com.alevel.tasks.levelThree.ThrirdTask;
import ua.com.alevel.tasks.levelTwo.SecondTask;

import java.util.Scanner;

public class ModuleTwoMain {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean ifLoop = true;
        while (ifLoop) {
            System.out.println("\nMenu:\n" +
                               "1. List of dates in a list without delimiters\n" +
                               "2. Find first unique name from the list of names\n" +
                               "3. Find the cheapest way between towns\n" +
                               "For exit enter any another symbol");

            String index = in.nextLine();
            switch (index) {
                case "1" -> FirstTask.run();
                case "2" -> SecondTask.run();
                case "3" -> ThrirdTask.run();
                default -> ifLoop = false;
            }
        }
    }
}
