package com.jslee.publisher.ColdHot;

import io.reactivex.Flowable;

public class ColdPublisherExample {
    public static void main(String[] args){

        Flowable<Integer> flowable = Flowable.just(1, 3, 5, 7);

        flowable.subscribe(data -> System.out.println("구독자1: " + data));
        flowable.subscribe(data -> System.out.println("구독자2: " + data));
    }
}
