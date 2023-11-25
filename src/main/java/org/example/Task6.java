package org.example;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        // Verilmis ededin tersini cap eden program yazin


        Scanner sc = new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
        int eded = sc.nextInt();

        // Ededi ters çevir
        int ters = 0;
        while (eded != 0) {
            int kalan = eded % 10; //ededin son addimini tap
            ters = ters * 10 + kalan; //tapilan addimi ters deyiskenine elave et
            eded = eded / 10; // ededin son addimini cixar
        }

        System.out.println("Ters çevrilmiş: " + ters);
    }
}

