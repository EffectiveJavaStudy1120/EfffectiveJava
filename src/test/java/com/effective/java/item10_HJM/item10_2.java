package com.effective.java.item10_HJM;

import org.junit.jupiter.api.Test;

import java.awt.*;

public class item10_2 {
    public class Point {  // 부모
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override public boolean equals(Object o) {
            if (!(o instanceof Point))
                return false;
            Point p = (Point)o;
            return p.x == x && p.y == y;
        }
    }
    public class ColorPoint extends Point {  // 자식
        private final Color color;

        public ColorPoint(int x, int y, Color color){
            super(x,y);
            this.color = color;
        }
        @Override public boolean equals(Object o) {
            if (!(o instanceof Point))
                return false;

            //o가 일반 Point면 색상을 무시하고 비교한다.
            if (!(o instanceof ColorPoint))
                return o.equals(this);

            // o가 ColorPoint면 색상까지 비교한다.
            return super.equals(o) && ((ColorPoint) o).color == color;
        }
    }
    @Test
    public void transitivity() {
        // 두 번째 equals 메서드(코드 10-3)는 추이성을 위배한다.
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        System.out.printf("%s %s %s%n",
                p1.equals(p2), p2.equals(p3), p1.equals(p3));
    }
}
