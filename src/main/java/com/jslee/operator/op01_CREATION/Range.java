package com.jslee.operator.op01_CREATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

/**
 * 지정한 값(n) 부터 m 개의 숫자(Integer)를 통지한다.
 * 절차형 프로그래밍방식의 for, while 문 등의 반복문을 대체할 수 있다.
 */
public class Range {
    public static void main(String[] args){

        // 0부터 시작해서 5개의 숫자를 반복해라!
        Observable<Integer> source =
                Observable.range(0, 5);

        source.subscribe(num -> Logger.log(LogType.ON_NEXT, num));


    }
}
