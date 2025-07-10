package org.example.simsim;

import java.util.Scanner;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound(String name) { System.out.println("멍멍"); }

    @Override
    void sound() {

    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 0 && y == 0)     System.out.println("0");
        else if (x > 0 && y > 0)  System.out.println("1");
        else if (x < 0 && y > 0)  System.out.println("2");
        else if (x < 0 && y < 0)  System.out.println("3");
        else                      System.out.println("4");
    }
}

