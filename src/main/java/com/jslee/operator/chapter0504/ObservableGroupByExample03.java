package com.jslee.operator.chapter0504;

import com.jslee.common.Car;
import com.jslee.common.CarMaker;
import com.jslee.common.SampleData;
import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;

/**
 * 제조사를 그룹으로 묶어서 자동차 명을 출력하는 예제
 */
public class ObservableGroupByExample03 {
    public static void main(String[] args) {
        Observable<GroupedObservable<CarMaker, Car>> observable =
                Observable.fromIterable(SampleData.carList)
                        .groupBy(Car::getCarMaker);

        observable
                .flatMapSingle(carGroup ->
                        carGroup.flatMap(car ->
                                Observable.just(car.getCarName()))
                                .toList()
                )
                .subscribe(System.out::println);

    }
}
