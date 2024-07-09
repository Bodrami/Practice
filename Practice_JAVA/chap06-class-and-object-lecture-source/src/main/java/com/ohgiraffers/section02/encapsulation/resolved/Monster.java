package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {
    /* 필기. 필드 변수 타입 앞에 private을 붙이면 접근을 제어할 수 있다. - 단일 책임의 원칙 때문에 접급 제어
    *       접근을 제어하는 이유는 밑에 메소드에서만 수정할 수 있게끔 해주는 것*/
    private String name;
    private int hp;

    void setInfo1(String info1){
        this.name = info1;
    }
    void setInfo2(int info2){
        this.hp = info2;
    }
}
