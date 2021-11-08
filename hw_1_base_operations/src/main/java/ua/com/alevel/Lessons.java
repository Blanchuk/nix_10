package ua.com.alevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lessons {

    public void startLesson() throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        Map<Integer, String> lessonScheduleMap = createLessonScheduleMap();
        try {
            getInput(in, lessonScheduleMap);
        } catch (NumberFormatException e) {
            System.out.println("Here you can enter only numbers then 1 to 10");
            getInput(in, lessonScheduleMap);
        }
    }

    private Map<Integer, String> createLessonScheduleMap() {
        Map<Integer, String> lessonScheduleMap = new HashMap<>();
        lessonScheduleMap.put(1, "9:00");
        lessonScheduleMap.put(2, "9:50");
        lessonScheduleMap.put(3, "10:50");
        lessonScheduleMap.put(4, "11:40");
        lessonScheduleMap.put(5, "12:40");
        lessonScheduleMap.put(6, "13:30");
        lessonScheduleMap.put(7, "14:30");
        lessonScheduleMap.put(8, "15:20");
        lessonScheduleMap.put(9, "16:20");
        lessonScheduleMap.put(10, "17:10");
        return lessonScheduleMap;
    }

    private void getInput(Scanner in, Map<Integer, String> schedule) {
        System.out.print("Input: ");
        Integer lessonNumber = in.nextInt();
        String lessonTime = schedule.get(lessonNumber);
        System.out.println("Lesson starts at " + lessonTime);
    }
}
