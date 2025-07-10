package org.example.chapter01;

import java.util.Scanner;

public class Z_Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 : ");
        String name = sc.nextLine();
        System.out.print("국어 점수 : ");
        int kor = sc.nextInt();
        System.out.print("영어 점수 : ");
        int eng = sc.nextInt();
        System.out.print("수학 점수 : ");
        int math = sc.nextInt();
        sc.nextLine();


        System.out.println("[이름 : " + name + "]");


        int max = kor + eng + math;
        System.out.println("총점: " + max + "점");

        double avg = max / 3.0;
        System.out.println("평균: " + avg + "점");

        String boo = kor >= 60 && eng >= 60 && math >= 60 ? "합격" : "불합격";
        // int soo = kor >= 60 && eng >= 60 && math >= 60 ? 1 : 0;
        System.out.println("합격 여부: " + boo);

        sc.close();

    }

}

