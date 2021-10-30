package ua.com.alevel.leveltwo.tree;

import java.util.Scanner;

import static ua.com.alevel.NumberUtil.readInteger;

public class Application {

    public void secondTask () {
        Tree tree = new Tree();
        Scanner in = new Scanner(System.in);
        int numOfNodes = readInteger(in, "Enter the number of nodes in the tree: ");

        for (int i = 0; i < numOfNodes; i++) {
            tree.insertNode(readInteger(in, "Enter element " + i + ":  "));
        }
        tree.insertNode(numOfNodes);

        System.out.println("Max depth: " + tree.maxDepth(tree.getRootNode()));
    }
}
