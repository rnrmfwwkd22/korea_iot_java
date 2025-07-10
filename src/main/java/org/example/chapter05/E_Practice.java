package org.example.chapter05;

class BaseballPlayer {
    // === 인스턴스 변수 ===
    // 선수 이름(name -  문자열)
    // 타율(battingAverage - 실수)
    // 홈런 수(homeRuns - 정수)

    // === 정적(클래스) 변수 ===
    // : 생성된 선수의 총 인원(playerCount - 정수)
    // >> 모든 인스턴스에서 공유

    // == 생성자 ==
    // +) 필드값 초기화 & 정적 변수 후위 증가

    // 1) 인스턴스 메서드
    // : double newBattingAverage, int newHomeRuns 값을 전달 받아 각각의 타율과 홈런 수를 업데이트

    // 2) 정적 메서드
    // : 특정 홈런 수 이상인 선수를 평가
    // : 홈런 수가 20개 이상이면 "홈런상 후보! 축하드립니다!"
    // : 미만일 경우 "홈런상 후보에 등록될 수 없습니다." 반환

    String name;
    double battingAverage;
    int homeRuns;

    static int playerCount;

    BaseballPlayer(String name, double battingAverage, int homeRuns) {
        this.name = name;
        this.battingAverage = battingAverage;
        this.homeRuns = homeRuns;

        playerCount++; // 증감연산자 사용 시 변수명과 기호를 붙여서 사용!
    }

    void updateStatus(double newBattingAverage, int newHomeRuns) {
        // 필드값과 매개변수명이 출동나지 X
        // >> this 키워드 생략 가능
        battingAverage = newBattingAverage;
        homeRuns = newHomeRuns;
    }

    static String evaluateHomeRun(int homeRunCount) {
        if (homeRunCount >= 20) {
            return  "홈런상 후보! 축하드립니다!";
        } else {
           return  "홈헌상 후보에 등록될 수 없습니다.";
        }

    }
}


public class E_Practice {
    public static void main(String[] args) {

        BaseballPlayer bass1 = new BaseballPlayer("김뿡뿡", 0.325, 16);
        BaseballPlayer bass2 = new BaseballPlayer("김본개", 0.321, 20);
        BaseballPlayer bass3 = new BaseballPlayer("전태희", 0.235, 11);
        BaseballPlayer bass4 = new BaseballPlayer("전강강", 0.457, 21);

        System.out.println("총 생성된 선수의 수: " + BaseballPlayer.playerCount);
        bass2.updateStatus(0.321, 22);
        System.out.println(bass2.battingAverage);
        System.out.println(bass2.homeRuns);

        System.out.println(BaseballPlayer.evaluateHomeRun(bass3.homeRuns));
        System.out.println(BaseballPlayer.evaluateHomeRun(bass4.homeRuns));

    }
}
