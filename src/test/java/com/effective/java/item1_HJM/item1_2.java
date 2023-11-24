package com.effective.java.item1_HJM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
@Slf4j
public class item1_2 {

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    static class Movie{
        private String Category;
    }
    static class MovieFactory {

        // Moive 객체를 저장하는 캐싱 저장소 역할
        private static final Map<String, Movie> cache = new HashMap<>();

        // 자주 사용될것 같은 Movie 의 객체 몇가지를 미리 등록한다
        static {
            cache.put("Action", new Movie("Action"));
            cache.put("Fantasy", new Movie("Fantasy"));
            cache.put("Romance", new Movie("Romance"));
        }

        // 정적 팩토리 메서드 (인스턴스에 대해 철저한 관리)
        public static Movie from(String Category) {

            if(cache.containsKey(Category)) {
                // 캐시 되어있으면 그대로 가져와 반환
                System.out.println("캐싱되어 있습니다.");
                return cache.get(Category);
            } else {
                // 캐시 되어 있지 않으면 새로 생성하고 캐싱하고 반환
                System.out.println("새로 생성하였습니다.");
                Movie cacheMovie = new Movie(Category);
                cache.put(Category, cacheMovie);
                return cacheMovie;
            }
        }
    }

    @Test
    void CheckCache(){
        Movie fantasy = MovieFactory.from("Action");
        Movie from = MovieFactory.from("액션");
    }
}
