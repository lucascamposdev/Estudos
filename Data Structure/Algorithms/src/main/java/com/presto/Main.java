package com.presto;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {1, 13, 5, 6, 3, 8, 12, 9};

        Tree<Integer> tree = new Tree<Integer>();

        tree.add(10);
        tree.add(5);
        tree.add(8);
        tree.preOrder(tree.getRoot());
    }


}