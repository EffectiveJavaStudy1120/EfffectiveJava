package com.effective.java.item12_HJM;

import org.junit.jupiter.api.Test;


public class item12 {
    @Test
    public void toStringTest() {
        cat cat = new cat("duckbae",22);
        System.out.println("cat = " + cat); 
        /**
         * 우리가 원하는 값은 해당 생성자의 name 과 age이다
         * */
        System.out.println("cat.toString() = " + cat.toString());

        /**
         *     public String toString() {
         *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
         *     }
         *     기본적으로 재정의를 안하면 최상위 객체인 Object 의 toString 메서드를 사용하게 됌
         */

    }
    public static class cat{
        private String name;
        private int age;

        public cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
