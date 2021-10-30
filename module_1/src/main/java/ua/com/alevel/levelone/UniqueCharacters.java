package ua.com.alevel.levelone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ua.com.alevel.NumberUtil.readInteger;

public class UniqueCharacters {

    public void countUniqueNumbers() {
        Scanner in = new Scanner(System.in);
        int str = readInteger(in, "Array length: ");
        Integer[] array = new Integer[str];
        for (int i = 0; i < str; i++) {
            array[i] = readInteger(in, "Enter element " + i + ":  ");
        }
        List<Integer> list = new ArrayList<>();
        for (Integer currentElement : array) {
            if (!list.contains(currentElement)) {
                list.add(currentElement);
            }
        }
        System.out.println("Unique numbers in the array: " + list.size());
    }
}



