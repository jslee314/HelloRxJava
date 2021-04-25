package com.jslee.operator.op01_CREATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

import java.time.LocalTime;

/**
 * 구독이 발생할 때마다 즉, subscribe( )가 호출될 때마다 '새로운' Observable을 생성한다.
 * 선언한 시점의 데이터를 통지하는 것이 아니라 호출 시점의 데이터를 통지한다.
 * 실제 구독이 발생할 때 Observable을 새로 반환하여 새로운 Observable을 생성한다
 * defer()를 활용하면 데이터 흐름의 생성을 지연하는 효과를 보여준다.
 * 데이터 생성을 미루는 효과가 있기때문에 최신 데이터를 얻고자할 때 활용할 수 있다.
 */
public class Defer {
    public static void main(String[] args) throws InterruptedException {

        // defer()를 이용해 통지
        Observable<LocalTime> observable =
                Observable.defer(() -> {
                    LocalTime currentTime = LocalTime.now();
                    return Observable.just(currentTime);
                });

        // just()를 이용해 통지
        Observable<LocalTime> observableJust =
                Observable.just(LocalTime.now());


        observable.subscribe(time -> Logger.log(LogType.PRINT, " # defer() 구독1의 구독 시간: " + time));
        observableJust.subscribe(time -> Logger.log(LogType.PRINT, " # just() 구독1의 구독 시간: " + time));

        Thread.sleep(3000);

        //  defer 는 선언한 시점의 데이터를 통지하는 것이 아니라 호출 시점의 데이터를 통지함
        observable.subscribe(time -> Logger.log(LogType.PRINT, " # 3초후 defer() 구독2의 구독 시간: " + time));
        observableJust.subscribe(time -> Logger.log(LogType.PRINT, " # 3초후 just() 구독2의 구독 시간: " + time));

    }
}
