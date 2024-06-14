package com.presto;

public class Palindromo {

    private String removeSpaces(String word){
        return word.replaceAll("\\s", "");
    }

    public boolean exec(String word){
        String givenString = removeSpaces(word).toLowerCase();

        StringBuilder builder = new StringBuilder(word);
        String reversed = builder.reverse().toString();

        reversed = removeSpaces(reversed).toLowerCase();

        return givenString.equals(reversed);
    }
}
