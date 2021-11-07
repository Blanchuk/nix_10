package ua.com.alevel;

import java.util.Scanner;

public class ReverseString {


    public static String reverse(String src) {
        StringBuilder reversibleString = new StringBuilder();
        for (int i = src.length() - 1; i >= 0; i--) {
            reversibleString.append(src.charAt(i));
        }
        return reversibleString.toString();
    }

    public static String reverseSubstring(String src, String dest) {
        StringBuilder reversibleString = new StringBuilder();
        for(int i = dest.length() - 1; i >= 0; i--) {
            reversibleString.append(dest.charAt(i));
        }
        return src.replaceAll(dest, reversibleString.toString());
    }

    public static String reverseIndex(String src, int firstIndex, int lastIndex) {
        StringBuilder reversibleString = new StringBuilder();
        for (int i = firstIndex; i <= lastIndex; i++) {
            reversibleString.append(src.charAt(i));
        }
        return src.replaceAll(reversibleString.toString(), reverse(reversibleString.toString()));
    }
}
