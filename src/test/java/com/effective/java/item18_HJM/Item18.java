package com.effective.java.item18_HJM;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Item18<E> extends HashSet<E>  {


    private int addCount;

    public Item18(int initCap, float loadFactor) {
        super(initCap,loadFactor);
    }

    public Item18() {
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount(){
        return addCount;
    }

    public static void main(String[] args) {
        Item18<String> s = new Item18<>();
        s.addAll(List.of("응","응응","응응응"));
        System.out.println("s = " + s.getAddCount());
        /**
         * Set 을 재정의하여 add 를 할때마다 addCount 가 올라가는 방식
         * add() 와 addAll()을 재정의해서 add 할때마다 카운트가 증가하고 addAll 을 할 때는 컬렉션의 size 만큼 카운트가 증가
         * 결과값으로는 3이 나와야 하는데 6이 나오는 모순이 발생
         *
         * 그 이유는 addAll()을 사용할때 add() 가 호출되기 떄문
         * 이처럼 상속을 통해 메서드를 재정의하면 내부로직을 알지 못하는 이상 오류를 범할 수 있음
         */
    }
}
