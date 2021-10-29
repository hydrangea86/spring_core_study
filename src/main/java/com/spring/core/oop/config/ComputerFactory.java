package com.spring.core.oop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //스프링 컨테이너 설정파일 등록
@ComponentScan(basePackages = "com.spring.core.oop.computer") //컨테이너 탐색 범위 설정 (패키지)

public class ComputerFactory {
}
