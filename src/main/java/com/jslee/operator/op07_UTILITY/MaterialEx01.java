package com.jslee.operator.op07_UTILITY;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

public class MaterialEx01 {
    public static void main(String[] args) {
        Observable.just(1, 2, 3, 4, 5, 6)
                .materialize()
                .subscribe(notification -> {
                    String notificationType =
                            notification.isOnNext() ? "onNext()" : (notification.isOnError() ? "onError()" : "onComplete()");
                    Logger.log(LogType.PRINT, "notification 타입: " + notificationType);
                    Logger.log(LogType.ON_NEXT, notification.getValue());
                });
    }
}
