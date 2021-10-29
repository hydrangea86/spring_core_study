package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component
public class SamsungKeyboard implements Keyboard{
    @Override
    public void info() {
        System.out.println("삼성키보드 입니다.");
    }
}
