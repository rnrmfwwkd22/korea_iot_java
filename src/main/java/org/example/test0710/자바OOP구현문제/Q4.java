package org.example.test0710.자바OOP구현문제;

interface Playable {

    default void Play() {
        System.out.println("악기의 소리");
    }


}

class Piano implements Playable {
    @Override
    public void Play() {
        System.out.println("도레미파시도~ 솔라");
    }
}
class Guitar implements Playable {
    @Override
    public void Play() {
        System.out.println("딩디기딩디기 딩딩딩");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Piano piano = new Piano();
        Guitar guitar = new Guitar();

        piano.Play();
        guitar.Play();
    }
}
