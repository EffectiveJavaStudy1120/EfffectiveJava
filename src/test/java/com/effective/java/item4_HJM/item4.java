package com.effective.java.item4_HJM;

public class item4 {
    public static void main(String[] args) {
        /**
         * 대표적인 정적메서드와 정적필드를담은 Math 라이브러리
         */
        Math.random();
        String hello = UtilityClass.hello();
        System.out.println("args = " + hello);
        UtilityClass utilityClass = new UtilityClass();
        System.out.println("utilityClass = " + utilityClass);
    }
    public static class UtilityClass {

        /**
         * 기본 생성자가 만들어지는 것을 막는다(인스턴스 방지용)
         * 이 클래스는 인스턴스를 만들 수 없는 유틸리티 클래스이다.
         */
        private UtilityClass() {
            throw new AssertionError();
        }

        public static String hello() {
            return "hello";
        }
    }
}
