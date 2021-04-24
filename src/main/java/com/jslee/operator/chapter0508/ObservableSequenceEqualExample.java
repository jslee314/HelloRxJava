package com.jslee.operator.chapter0508;

import com.jslee.common.CarMaker;
import com.jslee.common.SampleData;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import com.jslee.utils.TimeUtil;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * sequenceEqual 을 이용하여 두 Observable 의 모든 데이터가 같은지(순서, 데이터 수, 데이터 타입)를 판단하는 예제
 */
public class ObservableSequenceEqualExample {
    public static void main(String[] args) {
        Observable<CarMaker> observable1 =
                Observable
                        .fromArray(SampleData.carMakers)
                        .subscribeOn(Schedulers.computation())
                        .delay(carMaker -> {
                            TimeUtil.sleep(500L);
                            return Observable.just(carMaker);
                        }).doOnNext(data -> Logger.log(LogType.DO_ON_NEXT, "# observable1 : " + data));

        Observable<CarMaker> observable2 =
                Observable
                        .fromArray(SampleData.carMakersDuplicated)
                        .delay(carMaker -> {
                            TimeUtil.sleep(1000L);
                            return Observable.just(carMaker);
                        }).doOnNext(data -> Logger.log(LogType.DO_ON_NEXT, "# observable2 : " + data));


        Observable.sequenceEqual(observable1, observable2)
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
