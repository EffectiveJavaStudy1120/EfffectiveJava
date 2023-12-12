package com.effective.java.item10_HJM;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

public class item10 {
    @Test
    public void Test(){
        String s1 = new String("abc");
        String s2 = new String("abc");
        
        
        StringBuilder stringBuilder1 = new StringBuilder("abc");
        StringBuilder stringBuilder2 = new StringBuilder("abc");

        Assertions.assertThat(stringBuilder1).isNotEqualTo(stringBuilder2); /* 참조타입 Object 타입일 경우 주소값을 비교 */
        Assertions.assertThat(s1).isEqualTo(s2);/* 원시타입 primitive Type 일 경우 객체의 값을 비교*/

        /**
         *     public boolean equals(Object o) {
         *         if (o == this)
         *             return true;
         *         if (!(o instanceof List))
         *             return false;
         *
         *         ListIterator<E> e1 = listIterator();
         *         ListIterator<?> e2 = ((List<?>) o).listIterator();
         *         while (e1.hasNext() && e2.hasNext()) {
         *             E o1 = e1.next();
         *             Object o2 = e2.next();
         *             if (!(o1==null ? o2==null : o1.equals(o2)))
         *                 return false;
         *         }
         *         return !(e1.hasNext() || e2.hasNext());
         *     } 리스트를 구현한 구현체인 AbstractList 가 구현한 equals
         */
    }
    public final class CaseInsensitiveString {
        private final String s;

        public CaseInsensitiveString(String s) {
            this.s = Objects.requireNonNull(s);
        }

        @Override public boolean equals(Object o) {
                if (o instanceof CaseInsensitiveString)
                    return s.equalsIgnoreCase(
                            ((CaseInsensitiveString) o).s);

            if (o instanceof String)  // 한 방향으로만 작동한다!
                return s.equalsIgnoreCase((String) o);
            return false;
        }
        /**
        // 대칭성 위배!
        @Override public boolean equals(Object o) { // 빼주면 정상 동작
            return o instanceof CaseInsensitiveString &&
                    ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
        }
    }*/
    }
    @Test
    public void symmetry() {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "Polish";
        System.out.println(cis.equals(s)); // true
        System.out.println(s.equals(cis)); // false
        /**
         * 대칭성을 위배
         */
    }
}
