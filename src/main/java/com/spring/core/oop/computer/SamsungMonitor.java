package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component
public class SamsungMonitor implements Monitor {
    @Override
    public void info() {
        System.out.println("삼성모니터 입니다.");
    }
}
