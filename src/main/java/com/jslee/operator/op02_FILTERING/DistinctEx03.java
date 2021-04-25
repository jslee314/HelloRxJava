package com.jslee.operator.op02_FILTERING;

import com.jslee.common.SampleData;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

/**
 * 객체의 특정 필드를 기준으로 distinct 하는 예제
 */
public class DistinctEx03 {
    public static void main(String[] args) {

        Observable.fromIterable(SampleData.carList)
                .distinct(car -> car.getCarMaker())
                .subscribe(car -> Logger.log(LogType.ON_NEXT, car.getCarName()));

    }
}
