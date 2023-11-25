package org.example;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        // Task-4: Verilmis ededin bolenlerini cap eden program
        Scanner sc = new Scanner(System.in);
        System.out.print("Eded daxil edin: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num ; i++) {
            if (num % i == 0 || num / i == 1 ){
                System.out.print( i +" ");
            }
        }
    }
}
