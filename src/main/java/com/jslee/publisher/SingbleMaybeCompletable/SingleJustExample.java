package com.jslee.publisher.SingbleMaybeCompletable;

import com.jslee.utils.DateUtil;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Single;

public class SingleJustExample {
    public static void main(String[] args){
        Single.just(DateUtil.getNowDate())
                .subscribe(
                        data -> Logger.log(LogType.ON_SUCCESS, "# 날짜시각: " + data),
                        error -> Logger.log(LogType.ON_ERROR, error)
                );
    }
}
