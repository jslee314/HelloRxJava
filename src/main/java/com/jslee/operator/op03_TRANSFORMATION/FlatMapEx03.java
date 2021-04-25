package com.jslee.operator.op03_TRANSFORMATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

/**
 * FlatMap 두번째 유형을 이용한 구구단의 2단 출력 예제
 */
public class FlatMapEx03 {
    public static void main(String[] args) {
        Observable.range(2, 1)
                .flatMap(
                        data -> Observable.range(1, 9),
                        (sourceData, transformedData) ->
                                sourceData + " * " + transformedData + " = " + sourceData * transformedData
                )
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));

    }
}
