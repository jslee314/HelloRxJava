package com.jslee.operator.op01_CREATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import com.jslee.utils.TimeUtil;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 *
 * initialDelay 파라미터 이용해서 최초 통지에 대한 대기 시간을 지정할 수 있다.
 * 완료 없이 계속 통지한다.
 * 호출한 스레드와는 별도의 스레드에서 실행된다.
 * polling(어떤 특정 요청을 반복적으로 수행하는것)용도로 주로 사용.
 */
public class Interval {

    public static void main(String[] args){
        System.out.println("# start : " + TimeUtil.getCurrentTimeFormatted());

        // 0초 후에 시작해서 1초 간격으로 생성해라
        Observable.interval(0L, 1000L, TimeUnit.MILLISECONDS)
                .map(num -> num + " count")
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));

        // main 스레드를 딜레이 시켜줘야 RxComputationThreadPooldml 결과를 볼 수 있다.
        TimeUtil.sleep(3000);
    }
}
