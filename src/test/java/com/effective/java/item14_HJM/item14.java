package com.effective.java.item14_HJM;

import org.junit.jupiter.api.Test;

public class item14 {
/**
 * public interface Comparable<T> {
 * public int compareTo(T o);
 * 객체가 매개변수로 들어온 객체보다 작으면 음의 정수(-1) 같으면 0 크다면 양의 정수(+1) 을 반환
 *
 * */

        @Test
        void name()  {

        }
    public class Student implements Comparable<Student> {
        private int grade;
        private String name;
        private int age;

        @Override
        public int compareTo(Student o) {
            int result = Integer.compare(grade, o.grade);

            if (result == 0) {
                result = CharSequence.compare(name, o.name);
                if (result == 0) {
                    result = Integer.compare(age, o.age);
                }
            }

            return result;
        }
    }
}

