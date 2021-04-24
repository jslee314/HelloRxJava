package com.jslee.operator.chapter0502;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import com.jslee.utils.TimeUtil;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class ObservableSkipExample02 {
    public static void main(String[] args) {
        Observable.interval(300L, TimeUnit.MILLISECONDS)
                .skip(1000L, TimeUnit.MILLISECONDS)
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));

        TimeUtil.sleep(3000L);
    }
}
