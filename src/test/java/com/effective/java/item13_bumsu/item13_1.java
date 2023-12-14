package com.effective.java.item13_bumsu;


public class item13_1 implements Cloneable {


    규약이 매우 허술하ㄷ

// 가변 객체를 참조하지 않을 때
    @Override
    public item13_1 clone() {
        try {
            return (item13_1) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


}
