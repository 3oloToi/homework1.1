package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Bishkek";
        System.out.println(name);
        final int NUM = 20;
        String word = "word";
        name = NUM + word;
        System.out.println(name);
        if (NUM<0){
            System.out.println("меньше нуля");

        }
        if (NUM>0){
            System.out.println("больше нуля");

        }
        else {
            System.out.println("вы сохранили ноль");
        }




    }
}
