package ua.com.alevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lessons {
    public void startLesson() throws NumberFormatException {

        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        Map<Integer, String> s = new HashMap<>();
        s.put(1, "9:00");
        s.put(2, "9:50");
        s.put(3, "10:50");
        s.put(4, "11:40");
        s.put(5, "12:40");
        s.put(6, "13:30");
        s.put(7, "14:30");
        s.put(8, "15:20");
        s.put(9, "16:20");
        s.put(10, "17:10");
        try {
            String str = in.nextLine();
            int number = Integer.parseInt(String.valueOf(str));
            String first = s.get(number);
            System.out.println("Lesson starts at " + first);
        }
        catch (NumberFormatException e){
            System.out.println("Here you can enter only numbers then 1 to 10");
            System.out.print("Input: ");
            String str = in.nextLine();
            int number = Integer.parseInt(String.valueOf(str));
            String first = s.get(number);
            System.out.println("Lesson starts at " + first);
        }


    }

}
