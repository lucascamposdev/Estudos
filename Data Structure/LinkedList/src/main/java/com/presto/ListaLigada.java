package com.presto;

public class ListaLigada {

    private Cell first;
    private Cell last;
    private int size;

    public void addFirst(Object element){
        Cell newCell = new Cell(element);

        if(this.size == 0){
            this.first = newCell;
            this.last = newCell;
        }
        else{
            this.first.setBefore(newCell);
            newCell.setNext(this.first);

            this.first = newCell;
        }

        size++;
    }

    public void add(Object element){
        Cell newCell = new Cell(element);

        if(this.size == 0){
            addFirst(element);
        }else{
            this.last.setNext(newCell);
            newCell.setBefore(this.last);

            this.last = newCell;

            size++;
        }
    }

    public void add(int position, Object element){
        Cell newCell = new Cell(element);

        if(position == 0) {
            addFirst(element);
        } else if (position == this.size) {
            add(element);
        } else {
            Cell beforeCell = getCell(position - 1);

            newCell.setBefore(beforeCell);
            newCell.setNext(beforeCell.getNext());

            beforeCell.setNext(newCell);

            size++;
        }
    }

    private boolean isValidPosition(int position){
        return position >= 0 && position < this.size;
    }

    private Cell getCell(int position){

        if(!(isValidPosition(position))){
            throw new IllegalArgumentException("Invalid position");
        }

        Cell actual = this.first;

        for (int i = 0; i < position; i++) {
            actual = actual.getNext();
        }

        return actual;
    }

    private void removeFirst(){
        this.first = this.first.getNext();
        this.first.setBefore(null);
        size--;

        if (size == 0){
            this.first = null;
            this.last = null;
        }
    }

    private void removeLast(){
        Cell beforeCell = this.last.getBefore();

        beforeCell.setNext(null);
        this.last = beforeCell;

        size--;
    }

    public void remove(int position){
        if(!(isValidPosition(position))){
            throw new IllegalArgumentException("Invalid position");
        }

        if(position == 0){
            removeFirst();
        }
        else if(position == this.size - 1){
            removeLast();
        }
        else{
            Cell beforeCell = getCell(position - 1);
            Cell cellToRemove = beforeCell.getNext();
            Cell afterCell = cellToRemove.getNext();

            beforeCell.setNext(afterCell);
            afterCell.setBefore(beforeCell);

            size--;
        }
    }


    @Override
    public String toString() {
        return "ListaLigada{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
