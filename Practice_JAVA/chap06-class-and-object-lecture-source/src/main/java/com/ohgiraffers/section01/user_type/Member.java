package com.ohgiraffers.section01.user_type;

public class Member {

    /* 설명. 여러가지 타입의 값을 하나의 타입(Member 클래스)으로 묶을 수 있다.(c++의 구조체에 가까움) */
    // 회원이라면 필요한 값을 가지고 있는 클래스로 추상화의 개념이다. 필요한 속성만 넣음
    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobby;
}
