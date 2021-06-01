package com.jslee.operator.op02_FILTERING;

import com.jslee.common.Car;
import com.jslee.common.SampleData;
import com.jslee.utils.TimeUtil;;
import io.reactivex.Observable;

/**
 * 파라미터로 지정한 조건이 true가 될 때까지 데이터를 계속 통지한다.
 * 파리미터로 지정한 조건이 될 때까지 데이터를 계속 발행
 */
public class TakeUntilEx01 {
    public static void main(String[] args) {
        Observable.fromIterable(SampleData.carList)
                .takeUntil((Car car) -> car.getCarName().equals("트랙스"))
                .subscribe(car -> System.out.println(car.getCarName()));

        TimeUtil.sleep(300L);
    }
}
