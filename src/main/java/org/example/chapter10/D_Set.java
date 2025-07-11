package org.example.chapter10;

import java.util.HashSet;
import java.util.Set;

/*  === Set 인터페이스 ===
    : 중복 X, 순서 X
    - 중복된 요소를 포함하지 않는 객체의 집합
    - 객체가 저장 순서를 가지지 않음 (삽입된 순서 유지 X)
    - null 요소 포합 가능

    cf) List: 중복 O, 순서 O, null 요소 포함 가능

    == 종류 ==

    1. HashSet
        : 가장 많이 사뇽되는 Set 구현체
        - 빠른 데이터 접근, 삽입 지원
        - 정렬 또는 순서 보장 X

    2. LinkedHashSet
        : HashSet + 순서 O (HashSet의 기능 화장 형태)
        - 중복 X, 순서 O

    3. TreeSet
        : 데이터가 자동 정렬, 중복 제거 + 정렬된 순서 유지가 필요한 경우
        - 중복 X, 순서 O


 */
public class D_Set {
    public static void main(String[] args) {
        // == Set 컬렉션의 주요 메서드 == //
        // add(), remove(), contains(), size(), isEmpty()

        Set<String> students = new HashSet<>();

        students.add("정지지");
        students.add("정은은");
        students.add("최광광");
        students.add("손태태");

        System.out.println(students); // [손태태, 정은은, 최광광, 정지지]

        students.add("정은은");
        System.out.println(students); // [손태태, 정은은, 최광광, 정지지]

        boolean result = students.remove("최광광"); // 제거 후 완료 여부 반환
        System.out.println(result); // true
        System.out.println(students); // [손태태, 정은은, 정지지]

        boolean falseResult = students.remove("이승승");
        System.out.println(falseResult); // false

        System.out.println(students.size()); // 3

        System.out.println(students.contains("손태태")); // true
        System.out.println(students.contains("정지지")); // true
        System.out.println(students.contains("조승승")); // false

        System.out.println(students.isEmpty()); // false
        students.clear();
        System.out.println(students.isEmpty()); // true

    }
}
