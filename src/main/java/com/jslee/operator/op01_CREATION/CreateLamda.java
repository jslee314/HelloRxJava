package com.jslee.operator.op01_CREATION;

import io.reactivex.Observable;

public class CreateLamda {
    public static void main(String[] args) {
        Observable.create(emitter -> {
            emitter.onNext("Canada");
            emitter.onNext("USA");
            emitter.onNext("Korea");
            emitter.onComplete();
        }).subscribe(System.out::println);
    }
}
