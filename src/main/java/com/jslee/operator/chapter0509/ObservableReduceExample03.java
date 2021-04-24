package com.jslee.operator.chapter0509;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Observable;

/**
 * reduce를 이용해 문자열이 누적되어 처리되어 출력되는 예제
 */
public class ObservableReduceExample03 {
    public static void main(String[] args) {
        Observable.just("a", "b", "c", "d", "e")
//                .doOnNext(data -> Logger.log(LogType.DO_ON_NEXT, data))
                .reduce((x, y) -> "(" + x + ", " + y + ")")
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
