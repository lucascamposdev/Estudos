package com.presto;

public class Tree<T extends Comparable> {

    private Node<T> root;

    public Tree(){
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void add(T element){
        Node<T> newNode = new Node<T>(element);

        if(this.root == null){
            this.root = newNode;
        }else{
            Node<T> rootNode = this.root;
            while (true){
                if(newNode.getValue().compareTo(rootNode.getValue()) == -1){
                    if(rootNode.getLeft() != null){
                        rootNode = rootNode.getLeft();
                    }else{
                        rootNode.setLeft(newNode);
                        break;
                    }
                }else{ // Igual ou Maior
                    if(rootNode.getRight() != null){
                        rootNode = rootNode.getRight();
                    }else{
                        rootNode.setRight(newNode);
                        break;
                    }
                }
            }
        }
    }

//    Left - Top - Right   <- /\ ->
    public void inOrder(Node<T> element){
        if(element != null){
            inOrder(element.getLeft());
            System.out.println(element.getValue());
            inOrder(element.getRight());
        }
    }

//    Top - Left - Right /\ <- ->
    public void preOrder(Node<T> element){
        if(element != null) {
            System.out.println(element.getValue());
            preOrder(element.getLeft());
            preOrder(element.getRight());
        }
    }

//    Left - Right - Top  <- -> /\
        public void posOrder(Node<T> element){
            if(element != null){
                System.out.println(element.getValue());
                posOrder(element.getLeft());
                posOrder(element.getRight());
            }
    }
}
