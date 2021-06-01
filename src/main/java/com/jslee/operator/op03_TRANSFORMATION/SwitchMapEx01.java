package com.jslee.operator.op03_TRANSFORMATION;


import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import com.jslee.utils.TimeUtil;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * concatMap과 마찬가지로 받은 데이터를 변환하여 새로운 Observable로 반환한다.
 *concatMap과 다른점은 switchMap은 순서를 보장하지만 새로운 데이터가 통지되면 현재 처리중이던 작업을 바로 중단한다.
 *여러개의 발행된 값 중에 마지막에 들어온 값만 처리하고자 할 때 유용하다.
 *
 * 원본 소스의 처리 속도가 빨라서 현재 처리 중이던 작업을 중단하는 예제
 */
public class SwitchMapEx01 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("# start : " + TimeUtil.getCurrentTimeFormatted());
        Observable.interval(100L, TimeUnit.MILLISECONDS)
                .take(4)
                .skip(2)
                .doOnNext(data -> Logger.log(LogType.DO_ON_NEXT, data))
                .switchMap(
                        num -> Observable.interval(300L, TimeUnit.MILLISECONDS)
                                        .take(10)
                                        .skip(1)
                                        .map(row -> num + " * " + row + " = " + num * row)
                )
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));

        Thread.sleep(5000);
    }
}
