package ua.com.alevel;

import java.util.Scanner;

public class CollectionsMain {

    private Scanner in = new Scanner(System.in);
    private MathSet mathSet;

    public static void main(String[] args) {
        CollectionsMain test = new CollectionsMain();
        while (true)
            test.startApp();
    }

    private void startApp() {
        System.out.println("\n\n0. Exit\n" +
                           "    Creating a MathSet\n" +
                           "1. Create empty MathSet with dynamic capacity\n" +
                           "2. Create empty MathSet with fixed capacity\n" +
                           "3. Create MathSet from array of numbers\n" +
                           "    Operations with MathSet\n" +
                           "4. Add number\n" +
                           "5. Add vararg of numbers\n" +
                           "6. Join with another MathSet\n" +
                           "7. Intersect with another MathSet\n" +
                           "8. Sort MathSet by descending\n" +
                           "9. Sort a range of numbers in a MathSet by descending\n" +
                           "10. Sort starting from value in a MathSet by descending\n" +
                           "11. Sort MathSet by ascending\n" +
                           "12. Sort a range of numbers in a MathSet by ascending\n" +
                           "13. Sort starting from value in a MathSet by ascending\n" +
                           "14. Get number by index\n" +
                           "15. Get MAX value in MathSet\n" +
                           "16. Get MIN value in MathSet\n" +
                           "17. Get AVERAGE value in MathSet\n" +
                           "18. Get MEDIAN value in MathSet\n" +
                           "19. Display MathSet\n" +
                           "20. Display a range in MathSet by indexes\n" +
                           "21. Cut a range from MathSet by indexes\n" +
                           "22. Clear MathSet\n" +
                           "23. Clear from MathSet a range of numbers");
        System.out.println();
        System.out.print("Enter tour choice: ");
        String choice = in.nextLine();
        switch (choice) {
            case "0" -> System.exit(0);

            case "1" -> {
                mathSet = new MathSet();
                System.out.println("Created empty MathSet with dynamic capacity");
            }
            case "2" -> {
                System.out.print("Enter capacity: ");
                int capacity = Integer.parseInt(in.nextLine());
                mathSet = new MathSet(capacity);
                System.out.println("Created empty MathSet with fixed capacity");
            }
            case "3" -> {
                Number[] arr = getNumbers("Enter array of numbers by space: ");
                mathSet = new MathSet(arr);
                System.out.println("Created MathSet from array of numbers");
            }
            case "4" -> {
                System.out.print("Enter the number: ");
                Number number = Double.parseDouble(in.nextLine());
                mathSet.add(number);
            }
            case "5" -> {
                Number[] arr = getNumbers("Enter numbers by space: ");
                mathSet.add(arr);
            }
            case "6" -> {
                Number[] arr = getNumbers("Enter mathSet by space: ");
                MathSet temp = new MathSet(arr);
                mathSet.join(temp);
            }
            case "7" -> {
                Number[] arr = getNumbers("Enter mathSet by space: ");
                MathSet temp = new MathSet(arr);
                mathSet.intersection(temp);
            }
            case "8" -> {
                mathSet.sortDesc();
                System.out.println("Sorted mathSet by descending");
            }
            case "9" -> {
                System.out.print("Enter first index: ");
                int firstIndex = Integer.parseInt(in.nextLine());
                System.out.print("Enter last index: ");
                int lastIndex = Integer.parseInt(in.nextLine());
                mathSet.sortDesc(firstIndex, lastIndex);
            }
            case "10" -> {
                System.out.print("Enter number: ");
                int num = Integer.parseInt(in.nextLine());
                mathSet.sortDesc(num);
            }
            case "11" -> mathSet.sortAsc();

            case "12" -> {
                System.out.print("Enter first index: ");
                int firstIndex = Integer.parseInt(in.nextLine());
                System.out.print("Enter last index: ");
                int lastIndex = Integer.parseInt(in.nextLine());
                mathSet.sortAsc(firstIndex, lastIndex);
            }
            case "13" -> {
                System.out.print("Enter number: ");
                int num = Integer.parseInt(in.nextLine());
                mathSet.sortAsc(num);
            }
            case "14" -> {
                System.out.print("Enter index: ");
                int index = Integer.parseInt(in.nextLine());
                System.out.println(mathSet.get(index));
            }
            case "15" -> System.out.println("MAX value: " + mathSet.getMax());

            case "16" -> System.out.println("MIN value: " + mathSet.getMin());

            case "17" -> System.out.println("AVERAGE value: " + mathSet.getAverage());

            case "18" -> System.out.println("MEDIAN value: " + mathSet.getMedian());

            case "19" -> {
                System.out.println("MathSet:");
                for (Number n : mathSet.toArray()) {
                    System.out.print(n + " ");
                }
            }
            case "20" -> {
                System.out.print("Enter first index: ");
                int firstIndex = Integer.parseInt(in.nextLine());
                System.out.print("Enter last index: ");
                int lastIndex = Integer.parseInt(in.nextLine());
                System.out.println("A range in MathSet by indexes:");
                for (Number n : mathSet.toArray(firstIndex, lastIndex)) {
                    System.out.print(n + " ");
                }
            }
            case "21" -> {
                System.out.print("Enter first index: ");
                int firstIndex = Integer.parseInt(in.nextLine());
                System.out.print("Enter last index: ");
                int lastIndex = Integer.parseInt(in.nextLine());
                MathSet temp = mathSet.cut(firstIndex, lastIndex);
                System.out.println("Range that has been cut:");
                for (Number n : temp.toArray()) {
                    System.out.print(n + " ");
                }
            }
            case "22" -> mathSet.clear();

            case "23" -> {
                Number[] arr = getNumbers("Enter numbers by space: ");
                mathSet.clear(arr);
            }
        }
    }

    private Number[] getNumbers(String s) {
        System.out.print(s);
        String[] numbers = in.nextLine().split(" ");
        Number[] arr = new Number[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Double.parseDouble(numbers[i]);
        }
        return arr;
    }
}