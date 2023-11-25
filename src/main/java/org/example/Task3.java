package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Task -3: Verilmis cut ve ya tek oldugunu tapan program yazin


        Scanner sc = new Scanner(System.in);
        System.out.print("Eded daxil edin: ");
        int num = sc.nextInt();

        if ( num %2 == 0){
            System.out.println("Cutdur");
        } else {
            System.out.println("Tekdir");
        }


    }
}
