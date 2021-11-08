package ua.com.alevel;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Letters {

    public void count() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = in.nextLine();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                Integer frequency = map.get(str.charAt(i));
                map.put(str.charAt(i), frequency == null ? 1 : frequency + 1);
            }
        }
        for (Map.Entry<Character, Integer> me : map.entrySet()) {
            System.out.print(me.getKey() + " - ");
            System.out.println(me.getValue());
        }
    }
}

