package ua.com.alevel;

import ua.com.alevel.leveltwo.tree.StringValidation;
import ua.com.alevel.levelone.KnightsMove;
import ua.com.alevel.levelone.TriangleArea;
import ua.com.alevel.levelone.UniqueCharacters;
import ua.com.alevel.leveltwo.tree.Application;

import java.util.Scanner;

import static ua.com.alevel.NumberUtil.readInteger;

public class FirstModuleMain {

    private static final UniqueCharacters uniqueCharacters = new UniqueCharacters();
    private static final KnightsMove knightsMove = new KnightsMove();
    private static final TriangleArea triangleArea = new TriangleArea();
    private static final StringValidation stringValidation = new StringValidation();
    private static final Application application = new Application();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Enter one to select 1 level of tasks");
        

        while (!exit) {
            Integer str = readInteger(in, "Choose a level: ");
            switch (str) {
                case 1 -> levelOne(in);
                case 2 -> levelTwo(in);
                case 3 -> levelThree();
                case 0 -> exit = true;
            }
        }
        System.out.println("Thank you for your time!!!");
    }

    private static void levelOne(Scanner in) {
        Integer str = readInteger(in, "Select task: ");
        switch (str) {
            case 1 -> uniqueCharacters.countUniqueNumbers();
            case 2 -> knightsMove.move();
            case 3 -> triangleArea.findArea();
        }
    }

    private static void levelTwo(Scanner in) {
        Integer str = readInteger(in, "Select task: ");
        switch (str) {
            case 1 -> stringValidation.validate();
            case 2 -> application.secondTask();
        }
    }

    private static void levelThree() {
        System.out.println("The task is still in development");
    }
}

