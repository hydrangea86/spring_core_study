package com.spring.core.oop.computer;

import org.springframework.stereotype.Component;

@Component
public class LgMonitor implements Monitor{
    @Override
    public void info() {
        System.out.println("LG모니터 입니다.");
    }
}
