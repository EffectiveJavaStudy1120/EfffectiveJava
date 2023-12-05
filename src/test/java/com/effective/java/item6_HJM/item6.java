package com.effective.java.item6_HJM;

import java.util.regex.Pattern;

public class item6 {
    public static void main(String[] args) {
        String s = new String("bikini");


        String c = "bikini";
    }

    public static boolean isRomanNumeral(String s) {
        /**
         * 패턴 인스턴스를 사용을하게 되는데
         * 패턴 인스턴스는 한번 사용하고 바로 버려지며 또한, 비용이 비싸다는 단점이 발생
         */
        return s.matches("^(?=.)M*(C[MD] }D?C{0,3})"
                + "(X[CL]}L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    public static class RomanNumerals {
        /**
         * 자주 쓰는 값이라면 static final 로 초기에 캐싱해놓고 재사용 하자.
         */
        private static final Pattern ROMAN = Pattern.compile(
                "^(?=.)M*(C[MD]|D?C{0,3})"
                        + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

        static boolean isRomanNumeralFast(String s) {
            return ROMAN.matcher(s).matches();
        }
        private static long sum() {
            Long sum = 0L;
            for(long i=0; i<=Integer.MAX_VALUE; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
