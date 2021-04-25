package com.jslee.operator.op07_UTILITY;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import com.jslee.utils.NumberUtil;
import com.jslee.utils.TimeUtil;;
import io.reactivex.Observable;

/**
 * timeInterval을 이용해서 데이터가 통지되는데 걸린 시간을 통지하는 예제
 */
public class TimeIntervalEx {
    public static void main(String[] args) {
        Observable.just(1, 3, 5, 7, 9)
                .delay(item -> {
                    TimeUtil.sleep(NumberUtil.randomRange(100, 1000));
                    return Observable.just(item);
                })
                .timeInterval()
                .subscribe(
                        timed -> Logger.log(LogType.ON_NEXT, "# 통지하는데 걸린 시간: " + timed.time() + "\t# 통지된 데이터: " + timed.value())
                );
    }
}
