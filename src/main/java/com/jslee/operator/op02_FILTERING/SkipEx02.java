package com.jslee.operator.op02_FILTERING;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import com.jslee.utils.TimeUtil;;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * 파라미터로 지정한 시간 동안에는 데이터를 통지를 건너뛴 후 지정한 시간 이 후, 나머지 데이터를 통지한다.
 */

public class SkipEx02 {
    public static void main(String[] args) {


        Observable.interval(300L, TimeUnit.MILLISECONDS)
                .skip(1000L, TimeUnit.MILLISECONDS)
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));

        TimeUtil.sleep(3000L);
    }



}
