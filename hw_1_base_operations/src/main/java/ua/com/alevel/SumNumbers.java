package ua.com.alevel;

import java.util.Scanner;

public class SumNumbers {

    public  void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = in.nextLine();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
               int number = Integer.parseInt(String.valueOf(str.charAt(i)));
               result += number;
            }

        }
        System.out.println("Sum of all numbers" + result);
    }

}
