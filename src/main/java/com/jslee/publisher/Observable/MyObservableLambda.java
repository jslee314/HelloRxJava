package com.jslee.publisher.Observable;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class MyObservableLambda {

    public static void main(String[] args) throws InterruptedException {


        Observable<String> observable = Observable.create(emitter -> {
                    String[] datas = {"Hello", "RxJava!"};
                    for(String data : datas){
                        if(emitter.isDisposed())
                            return;
                        emitter.onNext(data);
                    }
                    emitter.onComplete();
                });

        observable.observeOn(Schedulers.computation())
                .subscribe(
                        data -> Logger.log(LogType.ON_NEXT, data),
                        error -> Logger.log(LogType.ON_ERROR, error),
                        () -> Logger.log(LogType.ON_COMPLETE),
                disposable -> {/**아무것도 하지 않는다.*/}
        );


         Thread.sleep(500L);



    }
}
