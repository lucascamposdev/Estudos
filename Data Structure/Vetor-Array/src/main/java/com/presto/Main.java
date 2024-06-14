package com.presto;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Lucas");
        Aluno a2 = new Aluno("Gabriel");
        Aluno a3 = new Aluno("Janio");
        Aluno a4 = new Aluno("Rita");
        Aluno a5 = new Aluno("Daiana");
        Aluno a6 = new Aluno("Samuel");

        Vetor vetor = new Vetor(5);

        vetor.add(a1);
        vetor.add(a2);
        vetor.add(a3);
        vetor.add(a4);
        vetor.add(a5);
        vetor.add(a6);

        vetor.shift();
        vetor.shift();
        vetor.shift();
        vetor.size();
        System.out.println(vetor);
    }
}