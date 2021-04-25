package com.jslee.operator.op02_FILTERING;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

/**
 * 파라미터로 지정한 개수나 기간이 될 때까지 데이터를 통지한다.
 * 지정한 범위가 통지 데이터보다 클 경우 데이터를 모두 통지하고 완료한다.
 * 지정한 갯수만큼 데이터를 발행
 */
public class TakeEx01 {
    public static void main(String[] args) {

        // 2개만 통과
        Observable.just("a", "b", "c", "d")
                .take(2)
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
