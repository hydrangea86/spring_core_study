package com.spring.core.oop.member;

import com.spring.core.oop.config.Factory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberControllerTest {

    @Test
    void controllerTest() {
//      MemberController mc = new MemberController();
//      Member member = new Member(1L, "김철수", Grade.BASIC);
//      mc.join(member);
        Factory factory = new Factory();
        MemberController mc = factory.memberController();

        mc.join(new Member(2L,"김나무", Grade.VIP ));
        mc.findMember(2L);
    }
}