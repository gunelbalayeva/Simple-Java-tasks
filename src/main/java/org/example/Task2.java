package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Task-2: Verilmis 3 ededden bouyunu tapan progaram yazin:
        Scanner sc = new Scanner(System.in);
        System.out.print("1-ci ededi daxil edin: ");
        int a = sc.nextInt();
        System.out.print(" 2-ci ededi daxil edin: ");
        int b = sc.nextInt();
        System.out.print("3-cu ededi daxil edin: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b <= a && b <= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}