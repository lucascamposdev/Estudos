package com.presto;

public class SelectionSort {

    public int[] execute(int[] list){
        for (int i = 0; i < list.length; i++) {
            int minIndex = getMinValueIndex(list, i);

            var temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
            }

        return list;
    }

    public int getMinValueIndex(int[] list, int actual){
        int menor = actual;

        for (int i = actual; i < list.length; i++) {
            if(list[menor] > list[i]){
                menor = i;
            }
        }
        return menor;
    }
}
