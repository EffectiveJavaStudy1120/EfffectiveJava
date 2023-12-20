package com.effective.java.item18_HJM;

import lombok.NoArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CustomHashSetComposition <E>{
    private final HashSet<E> hashSet;
    private int addCount = 0;

    public CustomHashSetComposition() {
        this.hashSet = new HashSet<>();
    }


    public boolean add(E e){
        addCount++;
        return hashSet.add(e);
    }

    public boolean addAll(Collection<? extends  E> c){
        addCount += c.size();
        return hashSet.addAll(c);
    }

    public int getAddCount(){
        return addCount;
    }

    @Test
    void Composition() {
        CustomHashSetComposition<Integer> hashSet = new CustomHashSetComposition<>();
        List<Integer> number = Arrays.asList(1,2,3,4,5);

        hashSet.addAll(number);
        hashSet.add(6);

        assertThat(hashSet.addCount).isEqualTo(6);
    }
}
