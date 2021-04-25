package com.jslee.operator.op05_COMBINATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import com.jslee.utils.TimeUtil;;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * zip을 이용해 2개의 Observable이 통지하는 데이터 중에서 통지되는 순서가 일치하는 데이터들을 조합하는 예제
 */
public class ZipEx01 {
    public static void main(String[] args) {
        Observable<Long> observable1 =
                Observable.interval(200L, TimeUnit.MILLISECONDS)
                        .take(4);

        Observable<Long> observable2 =
                Observable.interval(400L, TimeUnit.MILLISECONDS)
                        .take(6);

        Observable.zip(observable1, observable2, (data1, data2) -> data1 + data2)
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));

        TimeUtil.sleep(3000L);
    }
}
