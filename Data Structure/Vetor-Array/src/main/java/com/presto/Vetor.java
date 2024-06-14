package com.presto;

import java.util.Arrays;

public class Vetor {

    private Object[] list;
    private int size;

    public Vetor(int number){
        this.list = new Object[number];
    }

    public void add(Object element){
        checkArraySpace();

        this.list[this.size] = element;
        size++;
    }

//    Add First
    public void unshift(int position, Object element){
        checkArraySpace();

        for (int i = this.size; i > position; i--) {
            list[i] = list[i - 1];
        }

//        for (int i = position; i < this.size; i++) {
//            list[i + 1] = list[i];
//        }

        list[position] = element;
        size++;
    }

    private void checkArraySpace(){
        if(this.size == this.list.length){
            Object[] newArray = new Object[this.list.length * 2];

            for (int i = 0; i < this.list.length; i++) {
                newArray[i] = this.list[i];
            }

            this.list = newArray;
        }
    }

    public void pop(){
        this.list[this.size - 1] = null;
        size--;
    }

//    Remove first
    public void shift(){

        for (int i = 0; i < this.size ; i++) {
            list[i] = list[i + 1];
        }

        size--;
    }
    public void remove(int position){
        for (int i = position; i < this.size; i++) {
            this.list[i] = this.list[i + 1];
        }

        this.size--;
    }

    public boolean contains(Object element){

        for (int i = 0; i < this.size; i++) {
            if(element == list[i]){
                return true;
            }
        }

        return false;
    }

    public void get(int position){
        System.out.println("Value at position " + position + ": " + this.list[position]);
    }
    public void size(){
        System.out.println("Array size: " + this.size);
    }

    @Override
    public String toString() {
        return Arrays.toString(list) ;
    }
}
