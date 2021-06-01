package com.jslee.operator.op02_FILTERING;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

/**
 * 파라미터로 지정한 숫자만큼 데이터를 건너뛴 후 나머지 데이터를 통지한다.
 */
public class SkipEx01 {
    public static void main(String[] args) {

Observable.range(1, 7)
        .skip(3)
        .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
}
}
