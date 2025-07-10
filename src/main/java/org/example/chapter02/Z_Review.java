package org.example.chapter02;

public class Z_Review {
    public static void main(String[] args) {

        //      *****
        //      ****
        //      ***
        //      **
        //      *

        for (int i = 0; i < 5; i++) {

            for (int j = 1; j <= 5- i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        //      *****
        //       ****
        //        ***
        //         **
        //          *

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5- i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
