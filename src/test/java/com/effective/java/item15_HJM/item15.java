package com.effective.java.item15_HJM;

public class item15 {

    /**
     * 잘못된 설계 1
     */
    static class Man{
        public String name;
        public String age;
    }

    /**
     * 잘못된 설계 2
     */
    static class  Woman{
        public String name;
        public String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }

    /**
     * 올바른 설계
     */
    static class Adult{
        private String name;
        private String age;

        public String getName() {
            return name;
        }


        public String getAge() {
            return age;
        }

        public Adult(String name, String age) {
            this.name = name;
            this.age = age;
        }
    }
}
