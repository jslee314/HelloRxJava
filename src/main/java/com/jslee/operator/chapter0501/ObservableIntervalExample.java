package com.jslee.operator.chapter0501;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import com.jslee.utils.TimeUtil;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * polling 용도로 주로 사용.
 */
public class ObservableIntervalExample {
    public static void main(String[] args){
        System.out.println("# start : " +TimeUtil.getCurrentTimeFormatted());

        Observable.interval(1000L, TimeUnit.MILLISECONDS)
                .map(num -> num + " count")
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));

        TimeUtil.sleep(3000);
    }
}
