package com.jslee.operator.op03_TRANSFORMATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

/**
 * FlapMap을 이용한 1 대 다 mapping 예제
 * 원본 데이터를 원하는 값으로 변환 후 통지하는것은 map 과 같다.
 * map이 1 대 1 변환인 것과 달리 flatMap은 1 대 다 변환하므로 데이터 한개로 여러 데이터를 통지할 수 있다.
 * map은 변환된 데이터를 반환하지만 flatMap은 변환 된 여러개의 데이터를 담고 있는 새로운 Observable을 반환한다.
 */
public class FlatMapEx01 {
    public static void main(String[] args) {

        Observable.just("Hello")
                .flatMap(hello -> Observable.just("자바", "파이썬", "안드로이드").map(lang -> hello + ", " + lang))
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
