package com.jslee.operator.op04_TRANSFORMATION;

import com.jslee.common.SampleData;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

/**
 * 각각의 통지될 Car 객체를 List로 변환해서 Single로 한번만 통지하는 예제
 */
public class ToListEx02 {
    public static void main(String[] args) {
        Observable.fromIterable(SampleData.carList)
                .toList()
                .subscribe(carList -> Logger.log(LogType.ON_NEXT, carList));
    }
}
