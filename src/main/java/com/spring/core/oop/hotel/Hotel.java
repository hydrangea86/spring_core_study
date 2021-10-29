package com.spring.core.oop.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component  //이 클래스를 스프링컨테이너에 등록: 스프링에게 객체생성 제어권을 넘김
public class Hotel {

    //필드 주입
    //@Autowired //필요한 의존객체를 자동주입하겠다
    //@Qualifier("koreanRestaurant") //구체적인 구현체를 특정
    private final Restaurant restaurant;  //필드는 보통 부품 같은 개념 (restaurant는 인터페이스 설정 다형성 이용 목적 DI(의존성 주입)

    //생성자 주입(불변, 필수 의존관계 사용, 안전성을 위해서 생성자 주입을 사용할 것)
    @Autowired
    public Hotel(@Qualifier ("fr") Restaurant restaurant) {
        this.restaurant = restaurant;} //IOF(제어의 역전)


    //setter 주입(수정자 주입)
    //@Autowired
    //@Qualifier("frenchRestaurant")
    //public void setRestaurant(Restaurant restaurant) {
    //    this.restaurant = restaurant;}

    //레스토랑 예약기능
    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        restaurant.orderDinner();
    }

}
