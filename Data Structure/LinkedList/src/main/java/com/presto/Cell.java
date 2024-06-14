package com.presto;

public class Cell {

    private Object element;
    private Cell next;

    private Cell before;

    public Cell(Object element) {
        this.element = element;
        this.next = null;
        this.before = null;
    }

    public Cell getBefore() {
        return before;
    }

    public void setBefore(Cell before) {
        this.before = before;
    }

    public Object getElement() {
        return element;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "{Element: " + element +
                ", Next: " + next +
                '}';
    }
}
