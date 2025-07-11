package org.example.chapter10.Practice02;

/*  ==Inventory Management System ==
    : 다양한 상품을 관리하는 재고 관리 시스템

    1)프로젝트 구조
    - Main 파일: 프로그램 실행의 진입점

    - entity 패키지(데이터 모델 정의)
    : 데이터(상품)을 표현하는 클래스 정의 = 개게의 속성과 동작을 정의

    -service 패키지(비즈니스 로직 처리)
    : 상품 추가, 조회, 수정, 삭제와 같은 비즈니스 로직을 처리 (직접적인 데이터 조작)

    -repository 패키지 (데이터 저장소 역할
    : 데이터를 저장하고 검색하는 기능을 제공하는 클래스

    2) 요구사항
    -기능
        : 상품(Item) 추가, 수정, 삭제, 카테고리 상품 검색, 가격 또는 이름 등으로 정렬

    - 사용 컬렉션 프레임워크
        Set: 상품 관리(중복 상품 관리)
        Map: 카테고리별 상품 분류(Key: 카테고리명, Value: 상품 목록)

    - 추상 클래스 (Item: 모든 상품의 공통 필드 포함)
    -인터페이스 (Discountable: 할인 로직 제공)

 */

import org.example.chapter10.Practice02.repository.InMemoryItemRepository;
import org.example.chapter10.Practice02.service.InventoryService;
import org.example.chapter10.Practice02.service.InventoryServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        InventoryService inventoryService = new InventoryServiceImpl(new InMemoryItemRepository());

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("=== Invebtory Management System ===");
            System.out.println("1. 제품 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("3. 제품 수정 (가격)");
            System.out.println("4. 제품 삭제" );
            System.out.println("5. 제품 검색 (카테고리)");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴를 선택해주세요 >> ");
            
        }















    }
}
