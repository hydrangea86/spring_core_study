package com.spring.core.oop.computer;

import com.spring.core.oop.config.ComputerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ComputerTest {

    @Test
    void computerTest() {
        org.springframework.context.ApplicationContext ct
                = new AnnotationConfigApplicationContext(ComputerFactory.class);
        Computer computer = ct.getBean(Computer.class);
        computer.showSepc();
    }
}