package com.jslee.operator.op01_CREATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import com.jslee.utils.TimeUtil;;
import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

/**
 * 지정한 시간이 지나면 0(Long)을 통지한다.
 * 0을 통지하고 onComplete( ) 이벤트가 발생하여 종료한다.
 * 호출한 스레드와는 별도의 스레드에서 실행된다.
 * 설정한 시간이 지난 후에 특정 동작을 수행하고자 할때 사용
 */
public class Timer {
    public static void main(String[] args){

        Logger.log(LogType.PRINT, "# Start!");

        // 2초가 지난 후에 timer 함수에서 통지된 데이터를 map함수를 통해 전달받는다
        // 소비자는 timer에서 통지한 데이터 2초를 받는것이 아닌,
        // map 함수에서 string으로 변환한 Do work 문자열을 소비자쪽을 전달한다.
        Observable<String> observable =
                Observable.timer(2000, TimeUnit.MILLISECONDS)
                        .map(count -> "Do work!");

        observable.subscribe(data -> Logger.log(LogType.ON_NEXT, data));


        TimeUtil.sleep(3000);
    }
}
