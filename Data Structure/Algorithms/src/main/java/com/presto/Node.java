package com.presto;

public class Node<T> {

    private T value;
    private Node<T> right;
    private Node<T> left;

    public Node(T element){
        this.value = element;
        this.right = null;
        this.left = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }
}
