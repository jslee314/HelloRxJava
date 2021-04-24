package com.jslee.operator.chapter0502;

import com.jslee.common.CarMaker;
import com.jslee.common.SampleData;
import io.reactivex.Observable;

public class ObservableFilterExample02 {
    public static void main(String[] args) {
        Observable.fromIterable(SampleData.carList)
                .filter(car -> car.getCarMaker() == CarMaker.CHEVROLET)
                .filter(car -> car.getCarPrice() > 30000000)
                .subscribe(car -> System.out.println(car.getCarName()));
    }
}
