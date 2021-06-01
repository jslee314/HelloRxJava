package com.jslee.operator.op03_TRANSFORMATION;


import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * 원본 Observable에서 통지하는 데이터를 원하는 값으로 변환 후 통지한다.
 * 변환 전, 후 데이터 타입은 달라도 상관없다.
 * null을 반환하면 NullpointException이 발생하므로 null이 아닌 데이터 하나를 반드시 반환해야 한다.
 * Observable이 통지한 항목에 함수를 적용하여 통지된 값을 변환시킨다.
 */
public class MapEx01 {
    public static void main(String[] args){

List<Integer> oddList = Arrays.asList(1, 3, 5, 7);
Observable.fromIterable(oddList)
        .map(num -> "1을 더한 결과: " + (num + 1))
        .subscribe(data -> Logger.log(LogType.ON_NEXT, data));

    }
}
