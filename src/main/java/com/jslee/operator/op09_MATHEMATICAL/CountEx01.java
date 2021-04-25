package com.jslee.operator.op09_MATHEMATICAL;

import com.jslee.common.SampleData;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

/**
 * count를 이용하여 차량의 총 대수를 계산하는 예제
 */
public class CountEx01 {
    public static void main(String[] args) {
        Observable.fromIterable(SampleData.carList)
                .count()
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
