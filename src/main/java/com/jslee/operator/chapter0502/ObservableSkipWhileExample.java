package com.jslee.operator.chapter0502;

import com.jslee.common.SampleData;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Observable;

public class ObservableSkipWhileExample {
    public static void main(String[] args) {
        Observable.fromIterable(SampleData.carList)
                .skipWhile(car -> !car.getCarName().equals("티볼리"))
                .subscribe(car -> Logger.log(LogType.ON_NEXT, car.getCarName()));
    }
}
