package com.spring.core.oop.order;

import com.spring.core.oop.config.Factory;
import com.spring.core.oop.member.Grade;
import com.spring.core.oop.member.Member;
import com.spring.core.oop.member.MemberController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderControllerTest {
    void ocTest() {
        Factory factory = new Factory();
        MemberController mc = factory.memberController();
        OrderController oc = factory.memberController();

        //회원갑입
        mc.join(new Member(1L, "김철수", Grade.VIP));
    }

}