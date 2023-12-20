package com.effective.java.item17_HJM;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class item17 {

    @Test
    void test() {
        /**
         * 이렇게 할경우 불변성 즉 캡슐화의 의미가 없어짐
         */
        //given
        Address address = new Address("post");
        address.setPost("Post");
        Member member = new Member("HJM",address);

        //when
        String before = member.getAddress().getPost();
        address.setPost("Post2");
        String after = member.getAddress().getPost();

        assertThat(before).isNotEqualTo(after);
        //then

    }
}
