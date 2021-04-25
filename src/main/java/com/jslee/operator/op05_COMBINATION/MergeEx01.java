package com.jslee.operator.op05_COMBINATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import com.jslee.utils.TimeUtil;;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * 두개 이상의 Observable을 merge하여 통지된 시간 순대로 출력하는 예제
 */
public class MergeEx01 {
    public static void main(String[] args) {
        Observable<Long> observable1 = Observable.interval(200L, TimeUnit.MILLISECONDS)
                .take(5);

        Observable<Long> observable2 = Observable.interval(400L, TimeUnit.MILLISECONDS)
                .take(5)
                .map(num -> num + 1000);

        Observable.merge(observable1, observable2)
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));

        TimeUtil.sleep(4000);
    }
}
