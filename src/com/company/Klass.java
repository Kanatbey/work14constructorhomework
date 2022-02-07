package com.company;

public class Klass {
    private int number;
    private String word;
    private int[] array;

    public Klass(int number, String word, int[] array) {
        this.number = number;
        this.word = word;
        this.array = array;
        System.out.print(number + " " + word + " ");
        for (int a : array) {
            System.out.print(a + "  ");
        }

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setArray(int[] array) {
        this.array = array;
        for (int a : array) {
            System.out.println(a);
        }

    }
}
