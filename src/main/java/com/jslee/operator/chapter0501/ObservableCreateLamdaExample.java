package com.jslee.operator.chapter0501;

import io.reactivex.Observable;

public class ObservableCreateLamdaExample {
    public static void main(String[] args) {
        Observable.create(emitter -> {
            emitter.onNext("Canada");
            emitter.onNext("USA");
            emitter.onNext("Korea");
            emitter.onComplete();
        }).subscribe(System.out::println);
    }
}
