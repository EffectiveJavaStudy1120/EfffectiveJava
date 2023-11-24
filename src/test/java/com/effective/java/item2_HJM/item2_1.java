package com.effective.java.item2_HJM;

public class item2_1 {
    static class Hamburger{

        // 필수 매개변수
        private final String size;

        //선택적 매개변수
        private final int bun;
        private final int patty;
        private final int lettuce;
        private final int tomato;

        public Hamburger(String size, int bun, int patty, int lettuce, int tomato) {
            this.size = size;
            this.bun = bun;
            this.patty = patty;
            this.lettuce = lettuce;
            this.tomato = tomato;
        }

        public Hamburger(String size, int bun, int patty, int lettuce) {
            this(size, bun, patty, lettuce, 0);
        }

        public Hamburger(String size, int bun, int patty) {
            this(size, bun, patty, 0);
        }

        public Hamburger(String size, int bun) {
            this(size, bun, 0);
        }

        public Hamburger(String size) {
            this(size, 0);
        }
    }

    Hamburger BigBurger = new Hamburger("Big",1,2,3,4);
    /**
     * 점층적 생성자 패턴의 단점 현재 패티와, 상추가 필요없지만 값을 넣어줘야하는 모순이 생김
     */
    Hamburger hamburger = new Hamburger("Big",1,0,0,4);


}
