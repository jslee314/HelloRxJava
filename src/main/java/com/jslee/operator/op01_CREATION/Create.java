package com.jslee.operator.op01_CREATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Create {
    public static void main(String[] args){
        Observable<String> observable = Observable.create(
                new ObservableOnSubscribe<String>() {
                    @Override
                    public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                        emitter.onNext("Canada");
                        emitter.onNext("USA");
                        emitter.onNext("Korea");
                        emitter.onComplete();
                    }
                }
        );
        observable.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                // 아무것도 안함
            }

            @Override
            public void onNext(String data) {
                Logger.log(LogType.ON_NEXT, data);
            }

            @Override
            public void onError(Throwable error) {
                Logger.log(LogType.ON_ERROR, error);
            }

            @Override
            public void onComplete() {
                Logger.log(LogType.ON_COMPLETE);
            }
        });

    }
}
