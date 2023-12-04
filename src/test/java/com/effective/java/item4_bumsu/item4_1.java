package com.effective.java.item4_bumsu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class item4_1 {
    private item4_1() {
        throw new AssertionError("No UtilityClass instances for you!");
    }

    // Example static utility method
    public static int add(int a, int b) {
        return a + b;
    }

    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static double computeSomething(double value) {
        return Math.sqrt(value);
    }

    //실수로 만들었을 떄
    @Test
    public void testComputeSomething() {
        System.out.println(computeSomething(3));
        assertEquals(2, computeSomething(4)); // Just an example assertion
    }
}


//다른 함수에서 테스트
class MethodTest {
    @Test
    public void test() {
        System.out.println(item4_1.computeSomething(3));
    }
}
