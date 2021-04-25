package com.jslee.operator.op02_FILTERING;

import com.jslee.common.CarMaker;
import com.jslee.common.SampleData;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

/**
 * 전달 받은 데이터가 조건에 맞는지 확인한 후, 결과가 true인 데이터만 통지한다.
 * filter 라는 단어의 사전적 의미가 무언가를 걸러낸다는 의미이다.
 * 파라미터로 받는 Predicate 함수형 인터페이스에서 조건을 확인한다.
 */
public class FilterEx01 {
    public static void main(String[] args) {

        Observable.fromIterable(SampleData.carList)
                .filter(car -> car.getCarMaker() == CarMaker.CHEVROLET)
                .subscribe(car -> Logger.log(LogType.ON_NEXT, car.getCarMaker() + " : " + car.getCarName()));
    }
}
