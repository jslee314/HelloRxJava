package com.jslee.functionalProgrmming.fuctionalInterface;

import com.jslee.common.Car;
import com.jslee.common.CarMaker;
import com.jslee.common.CarType;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 하나의 추상 메서드를 가지고 있는 기존 인터페이스를 함수형 인터페이스로 사용하는 예제
 */
public class LegacyInterfaceToFunctionalInterface {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car(CarMaker.HYUNDAE, CarType.SUV, "팰리세이드", 28000000, true),
                new Car(CarMaker.SAMSUNG, CarType.SEDAN, "SM5", 35000000, true),
                new Car(CarMaker.CHEVROLET, CarType.SUV, "트래버스", 50000000, true),
                new Car(CarMaker.KIA, CarType.SEDAN, "K5", 20000000, false),
                new Car(CarMaker.SSANGYOUNG, CarType.SUV, "티볼리", 23000000, true)
        );

        Collections.sort(cars, (car1, car2) -> car1.getCarPrice() - car2.getCarPrice());

        for(Car car : cars)
            System.out.println("차 이름: " + car.getCarName() + ", 가격: " + car.getCarPrice());
    }
}
