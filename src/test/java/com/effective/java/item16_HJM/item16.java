package com.effective.java.item16_HJM;

import java.awt.*;

public class item16 extends Component{
    static class Point {
        public double x;
        public double y;
        /**
         * 퇴보한 클래스는 public 이여서는 안된다
         * 클래스는 데이터 필드에 직접 접근 할 수 있으나 캡슐화의 이점을 전혀 제공하지 못함
         * API를 수정하지 않고는 내부 표현을 변경하지 못하고 불변식을 보장하지 못하며, 외부에서 필드를 접근할 때 부수 작업이 필요하다
         */
    }
    static class Point2 {
        /**
         * private 접근 제어라를 통해서 캡슐화를 진행하여 불변성을 지킴
         * 직접 접근하지 못하게 하기위해 Getter, Setter 를 사용함으로써 접근의 용이성을 제공
         *
         */
        private double x;
        private double y;

        public Point2(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }

    /**
     * java.awt.Component 클래스에 있는 Dimension 의 size가 잘못된 설께
     * getSize() 를 호출할때 마다 새로운 인스턴스를 생성함
     * 그로인해 JVM 내부에 Heap 에 계속 메모리가 쌓이는 안티패턴이 발생
     *
     * @return
     */
    @Override
    public Dimension size() {
        return super.size();
    }

    public static void main(String[] args) {


    }
}
