package com.effective.java.item7_bumsu;

public class item7_1 {
    class SimpleStack<T> {

        private Object[] elements;
        private int size;
        private static final int DEFAULT_CAPACITY = 10;

        public SimpleStack() {
            this.elements = new Object[DEFAULT_CAPACITY];
            this.size = 0;
        }

        public void push(T element) {
            ensureCapacity();
            elements[size++] = element;
        }

        @SuppressWarnings("unchecked")
        public T pop() {
            if (isEmpty()) {
                return null; // 또는 예외 처리를 수행할 수 있음
            }
            T element = (T) elements[--size];
            elements[size] = null; // 참조 해제
            return element;
        }

        public T peek() {
            if (isEmpty()) {
                return null; // 또는 예외 처리를 수행할 수 있음
            }
            return (T) elements[size - 1];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        private void ensureCapacity() {
            if (size == elements.length) {
                elements = java.util.Arrays.copyOf(elements, 2 * size + 1);
            }
        }
    }

}
