package org.example;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        // Verilmis ededin faktorialini hesablayan program yazin:
        Scanner sc = new Scanner(System.in);
        System.out.print("Factorialini hesablamaq istediyiniz ededi daxil edin:");
        int num = sc.nextInt(); //5

        // 1*2*3*4*5 = 120
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println(result);

    }


}
