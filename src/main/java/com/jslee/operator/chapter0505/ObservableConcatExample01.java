package com.jslee.operator.chapter0505;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import com.jslee.utils.TimeUtil;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * concat 을 이용하여 2개 이상의 Observable을 하나의 Observable로 이어 붙여서 통지하는 예제
 */
public class ObservableConcatExample01 {
    public static void main(String[] args) {
        Observable<Long> observable1 =
                Observable.interval(500L, TimeUnit.MILLISECONDS)
                        .take(4);

        Observable<Long> observable2 =
                Observable.interval(300L, TimeUnit.MILLISECONDS)
                        .take(5)
                        .map(num -> num + 1000);

        Observable.concat(observable2, observable1)
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));


        TimeUtil.sleep(3500L);

    }
}
