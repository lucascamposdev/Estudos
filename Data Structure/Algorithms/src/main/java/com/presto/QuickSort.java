package com.presto;

public class QuickSort {

    public int[] execute(int[] list, int left, int right){
        if(left < right){
            int p = partition(list, left, right);
            execute(list, left, p);
            execute(list, p + 1, right);
        }

        return list;
    }

    private int partition(int[] list, int left, int right){
        int middle = (int) (left + right) / 2;
        int pivot = list[middle];

        int i = left - 1;
        int j = right + 1;

        while (true){
            do {
                i++;
            }while (list[i] < pivot);
            do {
                j--;
            }while (list[j] > pivot);
            if(i >= j){
                return j;
            }
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}
