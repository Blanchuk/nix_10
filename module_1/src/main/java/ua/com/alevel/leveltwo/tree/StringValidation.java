package ua.com.alevel.leveltwo.tree;

import java.util.Scanner;
import java.util.Stack;

public class StringValidation {

    public void validate() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        System.out.println(balancedParentheses(in.nextLine()));
    }

    private boolean balancedParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

