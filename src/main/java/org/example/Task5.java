package org.example;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        // Verilmis ededin polindrom olub olmamasini yoxlayan program yazin
        Scanner sc = new Scanner(System.in);
        // yeniEded - ters cevrilmis hali, qalan- addimlarin deyeri, temp-muveqqeti deyiskendir
        int eded, yeniEded = 0, qalan, temp;
        System.out.print("Eded daxil edin:");
        eded = sc.nextInt();
        temp = eded;
        while (temp > 0) {
            qalan = temp % 10;
            temp = (temp - qalan) / 10;
            yeniEded = yeniEded * 10 + qalan;
        }
        if (yeniEded == eded) {
            System.out.println("Polindromdur");
        } else {
            System.out.println("Deyil");
        }
    }
}
