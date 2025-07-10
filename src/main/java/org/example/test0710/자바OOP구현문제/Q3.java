package org.example.test0710.자바OOP구현문제;

import org.w3c.dom.ls.LSOutput;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape{
    @Override
    double getArea() {
        return 100.314;
    }

}

class Rectangle  extends Shape{
    @Override
    double getArea() {
        return 200.314;
    }

}

public class Q3 {
    public static void main(String[] args) {
        double a = 3.12;
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());



    }
}
