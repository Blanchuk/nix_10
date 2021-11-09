package ua.com.alevel;

import java.util.Scanner;

public class StringsMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.print("""
                    ---------------------------------------------------------------
                    Enter 1 for string reverse
                    Enter 2 to reverse the string by substring
                    Enter 3 to reverse the line by index
                    Enter 0 to exit
                    Select task:\040""");
            int task = Integer.parseInt(in.nextLine());
            switch (task) {
                case 1 -> reverseWord(in);
                case 2 -> substringReverse(in);
                case 3 -> indexReverse(in);
                case 0 -> exit = true;
            }
        }
    }

    private static void reverseWord(Scanner in) {
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        System.out.println("Reverse string: " + ReverseString.reverse(input));
    }

    private static void substringReverse(Scanner in) {
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        System.out.print("Enter a substring for reverse: ");
        String substring = in.nextLine();
        System.out.println("Reverse string: " + ReverseString.reverseSubstring(input, substring));
    }

    private static void indexReverse(Scanner in) {
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        System.out.print("Enter the first index: ");
        int firstIndex = Integer.parseInt(in.nextLine());
        System.out.print("Enter the second index: ");
        int twoIndex = Integer.parseInt(in.nextLine());
        System.out.println("Reverse string: " + ReverseString.reverseIndex(input, firstIndex, twoIndex));
    }
}


