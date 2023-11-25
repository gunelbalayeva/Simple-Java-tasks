package org.example;

public class Task7 {
    public static void main(String[] args) {
        // Task-7 :  1-100 cut ededleri cap eden program

        int result = 0;
        int cutEded = 0;
        int tekEded = 0;

        for (int i = 1; i < 100; i++) {
            // cut ededleri cap etmek ucun:
            if (i % 2 == 0 && i % i == 0) {
                System.out.println(i + i + " Cutdur");
            }
            // tek ededleri cap etmek ucun:
            else if (i%3==0 && i % 7==0) {
                System.out.println(i+ " Tek ededdir");
           }
        }
    }
}
