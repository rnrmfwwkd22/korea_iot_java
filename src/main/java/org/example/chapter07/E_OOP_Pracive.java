package org.example.chapter07;

// == 도서 관리 시스템 == //
// : 책의 정보를 저장, 책의 상태 (대여 가능 여부) 확인, 책의 정보 출력

// 1. BOok 클래스
// : 속성) title(String, 불변성) , author(String, 불변성) , isAvailable(boolean)
// : 메서드) borrowBook(), returnBook(), displayInfo()
// : 생성자) 매개변수 - title, author

class Book {
    private final String title;
    private final String author;
    private boolean isAvailable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        isAvailable = true;
    }

    // 책 대여 메서드
    void borrowBook() {
        if (isAvailable) {
            // 책 대여 가능 상태
            isAvailable = false;
            System.out.println("책 대여가 성공적으로 완료되었습니다.");
        } else {
            System.out.println("현재 대여 중입니다. (대여 불가)");
        }
    }

    //책 반납 메서드
    void returnBook() {
        if (!isAvailable) {
            //isAvailable이 false인 상태 - 대여 중인 상태
             isAvailable = true;
            System.out.println("책 반납이 성공적으로 완료되었습니다.");
        }else {
            System.out.println("이미 반납된 상태입니다. (반납 불가)");
        }
    }

    // 책 정보 출력 메서드
    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 대여가능 여부: " +
                        (isAvailable ? "대여 가능" : "대여 중"));

    }
    //캡슐화를 위한 getter 메서드 추가
    public  String getTitle() {return title; }
    public  String getAuthor() {return author; }
    public  boolean isAvailable() {return isAvailable; }
    // boolean 데이터는 getter 사용시 get 키워드 작성을 권장하지 않음
}

// 2) EBook 클래스 = Book 클래스를 상속
// 추가 속성) fileSize(double)
// 추가 메서드) displayInfo() - 재정의, fileSize()
// 생성자) EBook(title, author, fileSize)

class EBook extends Book {
    /*
        EBook() {
            super();
        }
     */
    private double fileSize;

    EBook(String title, String author,double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("파일 크기: " + fileSize + "MB");
    }

    double getFileSize() {
        return fileSize;
    }



}

public class E_OOP_Pracive {
    public static void main(String[] args) {
        //Book 객체 생성
        Book book1 = new Book("자바는 재밌어", "이승승");
        book1.displayInfo();
        book1.borrowBook();
        book1.displayInfo();
        book1.borrowBook();

        book1.returnBook();
        book1.returnBook();

        EBook eBook = new EBook("스프링부트는 더 재밌어", "이도도", 131.23);

        eBook.displayInfo();

        eBook.borrowBook();
        eBook.returnBook();

    }
}
