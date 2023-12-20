package com.effective.java.item17_HJM;

public class Member {
    private final String name;
    private final Address address;

//    public Member(String name, Address address) {
//        this.name = name;
//        this.address = address;     //Address를 직접 참조
//    }


    public Member(String name, Address address) {
        this.name = name;
        this.address = new Address(address.getPost()); // 생성자를 통해 주입
        /**
         * 방어적 복사 방법이라고 한다
         * 장점 : 불변성을 유지할 수 있음, 캡슐화를 유지가능하여 부작용을 방지
         * 단점 : 메모리 오버헤드가 발생할 수 있ㅇㅁ, Heap 메모리에 Member객체를 생성자를 통해서 만들때마다 Address 또한 생성자를 통해서 한번 더 만들어지기 떄문에
         * 성능의 영향을 줄 수 있음
         *
         */
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
