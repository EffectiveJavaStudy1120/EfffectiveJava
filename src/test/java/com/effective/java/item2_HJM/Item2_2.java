package com.effective.java.item2_HJM;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.junit.jupiter.api.Test;

public class Item2_2 {
    @Setter
    @NoArgsConstructor
    @ToString
    static class Hamburger {

        //필수 매개변수
        private int size = -1;
        //선택적 매개변수
        private  int bun =0;
        private  int patty = 0;
        private  int lettuce =0;
        private  int tomato= 0;
    }
    @Test
    public void MethodTest(){

        /**
         * Entity == domain  , 협업 일때 setter 사용해 -> 같이 일하는 사람들 도메인 직접적인 변경이 가능하게 되면
         * 데이터 일관성이 깨지게 됌
         * setter 지양 == 잘 쓰면안됌
         *
         * 도메인 row -> 값들 일관성 -> 이 데이터는 불변해야한다
         *
         * 이렇게 해당 객체에 Setter 를 활용하여 설정을 하면 점층적 생성자 패턴보다 보기쉬우며 딱히 단점도 안보인다
         * 하지만 이렇게 Setter 를 사용하여 객체를 지정할 경우 일관성이 무너질 확률이 높기때문에
         * Setter 패턴은 지양해야한다
         *
         */
        Hamburger hamburger = new Hamburger();

        //JPA dirtyChecking Patch 값을 수정해야할떄 기존의 도메인 내부의 있는 값들을 수정 할때는 setter Dirty Domian 값들을 변경
        hamburger.setSize(3);
        hamburger.setBun(2);
        hamburger.setPatty(4);


        System.out.println("hamburger = " + hamburger);

    }
}
