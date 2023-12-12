package com.effective.java.item11_HJM;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class item11 {



    @Test
    public void Hash(){
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707,867,5309),"Jenny");
        String s = m.get(new PhoneNumber(707, 867, 5309));
        Assertions.assertThat(s).isNull();
    }

    public static class PhoneNumber{
        Integer a;
        Integer b;
        Integer c;
        public PhoneNumber(Integer a, Integer b, Integer c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
