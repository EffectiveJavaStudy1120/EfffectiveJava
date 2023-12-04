package com.effective.java.item6_bumsu;
import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class FactorialWithCache {

    // 캐시를 위한 맵
    private static final Map<Integer, Long> cache = new ConcurrentHashMap<>();

    // 계승(factorial)을 계산하는 메서드
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("음수는 계승을 계산할 수 없습니다.");
        }

        // 메모이제이션: 이미 계산된 결과가 캐시에 있는지 확인
        return cache.computeIfAbsent(n, key -> (key == 0 || key == 1) ? 1 : key * factorial(key - 1));
    }
}

public class item6_1 {
    //너무 안좋은 예시
    String s1 = new String("erere");

    //
    String s2 = "bikini";


    @Test
    public void FactorialTest() {
        // 계승을 계산할 숫자
        int number = 5;

        // 계승 계산
        long result = FactorialWithCache.factorial(number);

        // 결과 출력
// 결과 출력
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
