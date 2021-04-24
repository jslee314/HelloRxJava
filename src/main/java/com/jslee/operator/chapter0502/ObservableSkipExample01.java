package com.jslee.operator.chapter0502;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Observable;

public class ObservableSkipExample01 {
    public static void main(String[] args) {
        Observable.range(1, 15)
                .skip(3)
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
