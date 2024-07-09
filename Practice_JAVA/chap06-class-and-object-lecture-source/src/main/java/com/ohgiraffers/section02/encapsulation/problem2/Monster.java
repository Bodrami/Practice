package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {

//    String name;
//    int hp;       // 변수명은 언제든지 바뀔 수 있음. 그렇기 때문에 문제발생

    /* 설명. 필드의 변수명이나 바꼈다면 */
    String kinds;
    int mp;

    // 단일 책임의 원칙: 한 메소드 내에서 수정이 일어나면 그 메소드에서만 에러가 나야하는 것을 의미(유지보수를 위한 목적)

    void setInfo1(String info1) {
//        this.name = info1;
        this.kinds = info1;

    }

    void setInfo2(int info2) {
//        this.hp = info2;
        this.mp = info2;
    }
}

