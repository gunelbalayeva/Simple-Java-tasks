package org.example;

public class Task8 {

    public static void main(String[] args) {

        //  Task-8: 1-100-dek cut ve tek ededlerin cemini toplayan  program
        int cem =0;
        int tek =0;
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                cem = i + i;
            } else if (i %3==1) {
                tek = i + i;
            }
        }
        System.out.println("Cut eded: " + cem);
        System.out.println("Tek eded: " + tek);


    }
}