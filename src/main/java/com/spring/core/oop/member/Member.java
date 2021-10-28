package com.spring.core.oop.member;

import lombok.*;

@Setter
@AllArgsConstructor  //모든 필드 생성자
@NoArgsConstructor  //기본생성자
@Getter
@ToString
public class Member {

    private Long id; //회원식별코드
    private String name; //회원명
    private Grade grade; //회원등급 Alt + Enter 열거형, 데이타베이스에는 문자열로 입력됨 ex)Grade.VIP

    //자바 빈즈 규약
    //기본생성장, 모든필드 초기화 생성자
    //getter, setter, toString, hashCode....
    //자바 빈즈 규약을 지키는 라이브러리 (lombok 롬복) 구글에 lombok
}
