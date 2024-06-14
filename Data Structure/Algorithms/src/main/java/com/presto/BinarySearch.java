package com.presto;

public class BinarySearch {

    public boolean execute(int[] list, int searchNumber){
        boolean found = false;

        int start = 0;
        int middle;
        int end = list.length - 1;

        while (start <= end){
            middle = (int) ((start + end) / 2);

            if(list[middle] == searchNumber){
                found = true;
                break;
            }else if(list[middle] < searchNumber){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }

        return found;
    }
}
