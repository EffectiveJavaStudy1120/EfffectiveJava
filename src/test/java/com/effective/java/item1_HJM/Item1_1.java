//package com.effective.java.item1_HJM;
//
//import lombok.*;
//import org.junit.jupiter.api.Test;
//
//public class Item1_1 {
//
//    @Builder
//    @AllArgsConstructor
//    @EqualsAndHashCode
//    @Getter
//    static class Movie {
//        private String name;
//        private Integer age;
//
//
//        public static Movie adultMovie(String name) {
//            return new Movie(name, 20);
//        }
//
//        public static Movie NomalMovie(String name, Integer age) {
//            return new Movie(name, age);
//        }
//
//        @Testt
//        void IemFormTest() {
//
//            Movie movie = new Movie("안녕미키", 19);
//
//            Movie adultMovie = Movie.adultMovie("그녀와 그놈");
//            Movie nomalMovie = Movie.NomalMovie("미녀와 야수", 15);
//
//        }
//    }
//}
//
//
