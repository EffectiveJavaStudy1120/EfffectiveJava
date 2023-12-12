package com.effective.java.item13_HJM;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.EmptyStackException;

public class item13 {
    public static class User implements Cloneable {
        private String name;
        private Integer age;

        @Override
        protected User clone() throws CloneNotSupportedException {
            return (User) super.clone();
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    @Test
    void cloneTest() throws CloneNotSupportedException {
        User hjm = new User("HJM", 20);
        User hjm2 = hjm.clone();
        Assertions.assertThat(hjm.getName()).isSameAs(hjm2.getName());


    }

    public class Stack implements Cloneable {

        private Object[] elements;
        private int size = 0;
        private static final int DEFAULT_INITIAL_CAPACITY = 16;

        public Stack() {
            elements = new Object[DEFAULT_INITIAL_CAPACITY];
        }

        public void push(Object e) {
            ensureCapacity();
            elements[size++] = e;
        }

        public Object pop() {
            if (size == 0)
                throw new EmptyStackException();
            Object result = elements[--size];
            elements[size] = null; // 다 쓴 참조 해제
            return null;
        }

        private void ensureCapacity() {
            if (elements.length == size)
                elements = Arrays.copyOf(elements, 2 * size + 1);
        }

        @Override
        public Stack clone() {
            try {
                Stack result = (Stack) super.clone();
                result.elements = elements.clone();
                return result;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}


