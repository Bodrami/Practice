package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {  // class의 접근 제어자는 pubilc 또는 default(안적힘) 두가지 밖에 없다.

    /* 필기. 접근제어자 primite을 활용하여 캡슐화를 적용한다.(같은 클래스를 제외한 곳에서는 접근불가) */
     String name;
    int hp;

    /* 설명. 3번째 몬스터 메소드 호출한 것*/
    public void setHp(int hp) {
        if(hp > 0)
        this.hp = hp;   // 클래스는 실체가 아니고 설계도이다.
                        // this는 메소드 호출 당시의 Monster 객체를 뜻하고 this.hp는 해당 객체의 hp공간을 뜻한다.
                        // 따라서 this는  메소드 호출을 하기 위한 구문으로 평소 메소드 호출 할때 자동 생성되어진다.
                        // 여기서 this는 메소드 호출 한 setHp(int hp)말한다.
        else if (hp <= 0) this.hp = 0;
    }
}
