package com.jslee.publisher.Single_Maybe_Completable;

import com.jslee.utils.DateUtil;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleObserver;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposable;

/**
 * Single 클래스를 사용하여 현재 날짜와 시각을 통지하는 예제
 */
public class SingleCreateExample {
    public static void main(String[] args){



        Single<String> single = Single.create(new SingleOnSubscribe<String>() {
            @Override
            public void subscribe(SingleEmitter<String> emitter) throws Exception {
                emitter.onSuccess(DateUtil.getNowDate());
            }
        });

        single.subscribe(new SingleObserver<String>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                // 아무것도 하지 않음.
            }

            @Override
            public void onSuccess(String data) {
                Logger.log(LogType.ON_SUCCESS, "# 날짜시각: " + data);
            }

            @Override
            public void onError(Throwable error) {
                Logger.log(LogType.ON_ERROR, error);
            }
        });



    }
}
