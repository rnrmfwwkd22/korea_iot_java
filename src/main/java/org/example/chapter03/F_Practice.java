package org.example.chapter03;

import java.util.ArrayList;
import java.util.Arrays;

public class F_Practice {
    public static void main(String[] args) {
        /*
                1. 크기 10의 ArrayList 생성
                2. 1~ 10 까지의 숫자를 차례로 추가
                3. 전체 리스트 출력 ( 원본 리스트: [1, 2, 3, 4, ...])
                4. 원본 리스트에서 홀수만 제거하고 결과를 출력 (반복문 & 조건문 사용)
                5. 인덱스 3에 값 50을 삽입한 뒤 결과를 출력
         */
        ArrayList<Integer> list = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {   //초기화를 0으로 하는 방법이 직관적인 반복 횟수 확인에 용이
            list.add(i + 1);
        }
        System.out.println("원본 리스트: " + list);

        for (int i = 0; i < list.size(); i++) {
            //리스트의 크기가 변동되기 떄문에 크기값을 매번 동적으로 확인
            if (list.get(i) % 2 != 0) {
                //홀수
                list.remove(i);  //홀수값 제거

                // 요소를 삭제하고 난 후 인덱스 조정 (ArrayList는 크기가 동적으로 변경)
//                : 연속된 요소를 제거할 떄 ( 홀수가 연속될 경우)
//                 list = [1, 3, 5, 7, 9]

//                i = 0일때 list.remove(0);
//                > [3, 5, 7, 9]
//                > 다음 인덱스인 i == 1일때  3이 아니라 5이기 떄문에 정상 동작 X
                i--; //그래서 i--를 해주면 정상 동작 O
            }
        }
        System.out.println("짝수 리스트: " + list);

        list.add(3, 50);
        System.out.println(list);

        //cf) 존재하지 않은 인덱스에 접근하면 예외 발생 ( IndexOutOfBoundsException)


//        for (int nList : list) {
//            if(nList %2 = )
//        }



    }
}
