package com.jslee.operator.op01_CREATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * Iterable 인터페이스를 구현한 클래스(ArrayList 등)를 파라미터로 받는다.
 * Iterable에 담긴 데이터를 순서대로 통지한다.
 */
public class FromIterable {
    public static void main(String[] args){

        List<String> countries = Arrays.asList("Korea", "Canada", "USA", "Italy");

        Observable.fromIterable(countries)
                .subscribe(country -> Logger.log(LogType.ON_NEXT, country));
    }
}
