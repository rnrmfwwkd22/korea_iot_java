package org.example.chapter02;

/*
                       ===반복문 (Loop)===
                       : 특정 조건 만족 시 까지 동일한 작업 반복
                       - for (~동안), while (~동안), do -while
 */

public class C_For {
    public static void main(String[] args) {
          /*
                        for문
                        : 특정 조건이 만족될 때까지 코드 블록을 반복 실행
                        >> 횟수를 지정
                        >> 반복해야 할 횟수가 있을 떄

                        for( 초기화식; 조건식; 증감식) {
                            조건이 만족될 때까지 실행할 코드 블록
                        }

                        1. 초기화식
                           : 반복을 시작할 떄 사용할 변수를 초기화 (반복에 사용할 변수)
                        2. 조건식
                           : 반복이 실행될 조건을 정의하는 부분 (해당 조건이 참인 동안 반복문이 실행)
                        3. 증감식
                           : 반복문의 각  실행이 끝나고 변수의 값을 증감하는 부분(매 반복 시 실행)  */

        for (int num = 1; num <= 5; num++) {
            System.out.print(num + "\t"); //12345
        }
        System.out.println();

        //=============예제 1
        // : for  반복문을 사용하여 1부터 10까지의 숫자 중 짝수만 출력
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }

        // ============예제 2
        // : 구구단 (3단)
        System.out.println();
        int num = 3;

        for (int i = 1; i <= 9; i++) {

            System.out.print(num + " X " + i + " = " + (num * i) + "\t");
        }


        // cf) for 문의 횟수 지정 방법
        /*
           1) 초기화 0으로 설정
           : int i = 0; i < n ; i++
           >> n번 반복

           2)초기화를 1호 설정
           : int i = 1; i< = n; i++
           >> n번 반복


           cf) 충접 for문(반복문)
           : for문 내에 또 다른 for문 작성

           ===에제 ===
           : 구구단 전체를 출력하는 코드
           >> 2단 ~ 9단까지 반복 (8번 반복)
           >> 각 단의 내부에서는 1부터 9까지 숫자 반복 (9번 반복)
         */
//                                 내가 한거~!!!
        for (int i = 0; i < 10; i++) {
            if (i > 1) {
                System.out.println("[ " + i + "단 ]");
            }
            for (int j = 0; j < 10; j++) {
                if (j > 0) {
                    System.out.print(i + " X " + j + " = " + (i * j) + " ");
                }


            }
            System.out.println();
        }
        //                   슨상님이 한거~~!!!!!!
        for (int i = 0; i < 10; i++) {
            int dan = i + 2;
            System.out.println("[ " + dan + "단 ]");

            for (int j = 0; j < 10; j++) {
                int numter = j + 1;
                System.out.println(dan + " X " + numter + " = " + (dan * numter) + " ");
            }
        }

        int i =0 ;  //for문과 다른 scope(영역)
        // int i = 1; - 동일한 영역 내에서 같은 이름의 변수 선언 불가!






    }
}
