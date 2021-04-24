package com.jslee.operator.chapter0503;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Observable;

/**
 * FlapMap을 이용한 1 대 다 mapping 예제
 */
public class ObservableFlatMapExample01 {
    public static void main(String[] args) {
        Observable.just("Hello")
                .flatMap(hello -> Observable.just("자바", "파이썬", "안드로이드").map(lang -> hello + ", " + lang))
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
