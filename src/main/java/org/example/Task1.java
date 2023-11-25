package org.example;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        // Task: 1 Verilmis 2 ededden bouyunu tapan progaram yazin:
        Scanner sc = new Scanner(System.in);
        System.out.print("1-ci ededi daxil edin: ");
        int a = sc.nextInt();
        System.out.print(" 2-ci ededi daxil edin: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " boyukdur");
        } else if (a < b) {
            System.out.println(b+ " boyukdur");
        }else {
            System.out.println("beraberdir");
        }
    }
}
