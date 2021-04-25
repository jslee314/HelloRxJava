package com.jslee.operator.op03_TRANSFORMATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import com.jslee.utils.TimeUtil;;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * flatMap과 마찬가지로 받은 데이터를 변환하여 새로운 Observable 로 반환한다.
 *반환된 새로운 Observable을 하나씩 순서대로 실행하는것이 FlatMap과 다르다.
 *즉, 데이터의 처리 순서는 보장하지만 처리중인 Observable의 처리가 끝나야 다음 Observable이 실행되므로 처리 성능에는 영향을 줄 수 있다.
 *
 *
 * 순서를 보장해주는 concatMap 예제
 * 순차적으로 실행되기때문에 flatMap보다 느리다.
 */
public class ConcatMapEx01 {
    public static void main(String[] args) {
        TimeUtil.start();
        Observable.interval(100L, TimeUnit.MILLISECONDS)
                .take(4)
                .skip(2)
                .concatMap(
                        num -> Observable.interval(200L, TimeUnit.MILLISECONDS)
                                .take(10)
                                .skip(1)
                                .map(row -> num + " * " + row + " = " + num * row)
                ).subscribe(
                        data -> Logger.log(LogType.ON_NEXT, data),
                        error -> {},
                        () -> {
                            TimeUtil.end();
                            TimeUtil.takeTime();
                        }
                );

        TimeUtil.sleep(5000L);
    }
}
