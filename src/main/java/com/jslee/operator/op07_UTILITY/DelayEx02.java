package com.jslee.operator.op07_UTILITY;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import com.jslee.utils.TimeUtil;;
import io.reactivex.Observable;

/**
 * 통지되는 데이터 각각에 지연 시간을 적용하는 예제:q!
 */
public class DelayEx02 {
    public static void main(String[] args) {
        Observable.just(1,3,5,7)
                .flatMap(item -> {
                    TimeUtil.sleep(1000L);
                    return Observable.just(item); // 새로운 Observable의 통지 시점에, 원본 데이터를 통지한다.
                }).subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
