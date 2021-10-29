package com.spring.core.oop.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private final Keyboard keyboard;
    private final Mouse mouse;
    private final Monitor monitor;

    @Autowired
    public Computer(
            @Qualifier("samsungKeyboard") Keyboard keyboard,
            @Qualifier("appleMouse") Mouse mouse,
            @Qualifier("samsungMonitor") Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public void showSepc() {
        System.out.println("======== 컴퓨터 정보 ========");
        monitor.info();
        mouse.info();
        keyboard.info();


    }
}
