package ua.com.alevel;

import java.util.Scanner;

public class NumberUtil {

    private static final String INTEGER_REGEX = "[0-9]+";

    public static Integer readInteger(Scanner in, String out) {
        System.out.print(out);
        String x1 = in.nextLine();
        while (!x1.matches(INTEGER_REGEX)) {
            System.out.println("Only integer numbers can be entered here!!!");
            System.out.print(out);
            x1 = in.nextLine();
        }
        return Integer.parseInt(x1);
    }
}

