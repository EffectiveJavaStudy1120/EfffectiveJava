//package com.effective.java.item3_HJM;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class item3_1 {
//    static class Singleton {
//        public final static Singleton INSTANCE = new Singleton();
//
//        private Singleton() {}
//    }
//
//    @Test
//    void SingleTonTest(){
//        Singleton instance = Singleton.INSTANCE;
//        Singleton instance2 = Singleton.INSTANCE;
//        Singleton singleton = new Singleton();
//        // 싱글톤
//        Assertions.assertThat(instance).isSameAs(instance2);
//        // 싱글톤이 아닌 테스트케이스
//        Assertions.assertThat(singleton).isNotSameAs(instance2);
//    }
//    static class StaticSingleTon  {
//        public static final StaticSingleTon Singleton2 = new StaticSingleTon();
//        private StaticSingleTon(){}
//
//        public static StaticSingleTon getInstance(){
//            return Singleton2;
//        }
//    }
//    @Test
//    void TestStaticSingleTon(){
//        StaticSingleTon instance = StaticSingleTon.getInstance();
//        StaticSingleTon instance2 = StaticSingleTon.getInstance();
//        StaticSingleTon singleTon = new StaticSingleTon();
//        System.out.println("instance = " + instance);
//        System.out.println("instance2 = " + instance2);
//        Assertions.assertThat(instance).isSameAs(instance2);
//        Assertions.assertThat(instance).isNotSameAs(singleTon);
//    }
//}
