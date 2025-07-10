package org.example.test0710.자바OOP구현문제;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("음수가 될수 없습니다.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    void displayInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

}

public class Q2 {
    public static void main(String[] args) {
        Person person = new Person("홍길도이", 10);
        person.displayInfo();

        person.setAge(-12);
        person.displayInfo();

        person.setAge(20);
        person.displayInfo();
    }
}
