//package com.effective.java.item2_HJM;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//import org.junit.jupiter.api.Test;
//
//public class item2_3 {
//    @Builder
//    @ToString
//    @AllArgsConstructor
//    @NoArgsConstructor
//    static class Hamburger {
//
//        //필수 매개변수
//        private int size = -1;
//        //선택적 매개변수
//        private  int bun =0;
//        private  int patty = 0;
//        private  int lettuce =0;
//        private  int tomato= 0;
//    }
//
//    /**
//     * 빌더 패턴을 사용하였을 경우 앞써 말한 두가지의 단점들이 발생하지 않는다
//     */
//    @Test
//    void BuilderTest(){
//        Hamburger hamburger = Hamburger.builder()
//                .bun(2)
//                .tomato(3)
//                .size(2)
//                .build();
//        System.out.println("hamburger = " + hamburger);
//
//    }
//
//}
