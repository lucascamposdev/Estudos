package com.presto;

public class InsertionSort {

    public int[] execute(int[] list){
        int aux, j;

        for (int i = 1; i < list.length; i++) {
            aux = list[i];
            j = i - 1;

                while (j >= 0 && list[j] > aux){
                    list[j + 1] = list[j];
                    j--;
                }
                list[j+1] = aux;
        }
        return list;
    }
}
