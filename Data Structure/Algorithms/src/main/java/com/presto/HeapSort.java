package com.presto;

import java.util.Arrays;

public class HeapSort {

    public int[] execute (int[] list){
        int size = list.length;

        // vai até o meio do array pra formar os nodes da arvore
        for (int i = size / 2 - 1; i >= 0 ; i--) {
            applyHeap(list, size, i);
        }

        System.out.println(Arrays.toString(list));

        // os maiores valores (raízes) estão no começo do array agora
        // pega eles, joga pro final e aplica o heap
        for (int i = size - 1; i >= 0; i--) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;

            applyHeap(list, i, 0);
        }

        return list;
    }

    private void applyHeap(int[] list, int size, int i){
        int root = i;
        int leftNode = 2 * i + 1;
        int rightNode = 2 * i + 2;

        // se o nó da esquerda estiver dentro do array
        // e  o valor que está nele for maior que o da raíz
        // agora ele sobe pra raíz
        if(leftNode < size && list[leftNode] > list[root]){
            root = leftNode;
        }
        // se o nó da direita estiver dentro do array
        // e o valor que está nele for maior que o da raíz
        // agora ele sobe pra raíz
        if(rightNode < size && list[rightNode] > list[root]){
            root = rightNode;
        }

        // se houve alguma troca
        // agora faça de fato a troca, passando o valor da raíz para a posição i
        if(root != i){
            var temp = list[i];
            list[i] = list[root];
            list[root] = temp;

            applyHeap(list, size, root); // chama até não haver mais trocas, ou seja, root == i
        }
    }
}
