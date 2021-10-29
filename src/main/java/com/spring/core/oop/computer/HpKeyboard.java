package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component
public class HpKeyboard implements Keyboard{
    @Override
    public void info() {
        System.out.println("HP 키보드입니다.");
    }
}
