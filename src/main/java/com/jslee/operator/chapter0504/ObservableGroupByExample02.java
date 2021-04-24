package com.jslee.operator.chapter0504;

import com.jslee.common.Car;
import com.jslee.common.CarMaker;
import com.jslee.common.SampleData;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Observable;
import io.reactivex.observables.GroupedObservable;

/**
 * Group으로 묶은 데이터들 중에서 filter를 이용해 필터링한 Group의 데이터만 출력하는 예제
 */
public class ObservableGroupByExample02 {
    public static void main(String[] args) {
        Observable<GroupedObservable<CarMaker, Car>> observable =
                Observable.fromIterable(SampleData.carList).groupBy(Car::getCarMaker);

        observable.subscribe(
                groupedObservable ->
                        groupedObservable
                                .filter(car -> groupedObservable.getKey().equals(CarMaker.CHEVROLET))
                                .subscribe(
                                        car -> Logger.log(
                                                LogType.PRINT, "Group: "
                                                        + groupedObservable.getKey()
                                                        + "\t Car name: " + car.getCarName())
                                )
        );

    }
}
