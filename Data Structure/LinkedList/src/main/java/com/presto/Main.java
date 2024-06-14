package com.presto;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ListaLigada list = new ListaLigada();

        list.add("lucas");
        list.add("gabriel");
        list.add("janio");
        list.add(3, "daiana");
        list.remove(3);
//        list.add("rita");
//        list.add("samuel", 5);


        System.out.println(list);
    }
}