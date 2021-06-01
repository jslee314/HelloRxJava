package com.jslee.operator.op05_COMBINATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import com.jslee.utils.TimeUtil;;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * - 각 Observable에서 통지할 때 마다 모든 Observable에서 마지막으로 통지한 데이터들을 함수형 인터페이스에 반환하고,
 * 이를 가공해서 통지하는 예제.
 * - 각 Observable 중 하나의 Observable에서만 통지가 발생하더라도 이미 통지한 Observable의 마지막 데이터와
 * 함께 전달된다.
 *
 */
public class CombineLatestEx01 {
    public static void main(String[] args) {
        Observable<Long> observable1 =
                Observable.interval(500L, TimeUnit.MILLISECONDS)
//                        .doOnNext(data -> Logger.don("# observable 1 : " + data))
                        .take(4);

        Observable<Long> observable2 =
                Observable.interval(700L, TimeUnit.MILLISECONDS)
//                        .doOnNext(data -> Logger.don("# observable 2 : " + data))
                        .take(4);

        Observable.combineLatest(
                observable1,
                observable2,
                (data1, data2) -> "data1: " + data1 + "\tdata2: " + data2)
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));

        TimeUtil.sleep(3000L);
    }
}
