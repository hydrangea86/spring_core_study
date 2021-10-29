package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component
public class LogitecMouse implements Mouse{
    @Override
    public void info() {
        System.out.println("로지텍마우스 입니다.");
    }
}
