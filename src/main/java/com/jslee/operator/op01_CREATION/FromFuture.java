package com.jslee.operator.op01_CREATION;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import com.jslee.utils.TimeUtil;;
import io.reactivex.Observable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Future 인터페이스는 자바 5에서 비동기 처리를 위해 추가된 "동시성 API"이다.
 * 시간이 오래 걸리는 작업은 Future를 반환하는 ExcutorService에게 맡기고
 * 비동기로 다른 작업을 수행할 수 있다.
 * Java 8에서는 CompletableFuture 클래스를 통해 구현이 간결해졌다.
 */
public class FromFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Logger.log(LogType.PRINT, "# start time");

        // 긴 처리 시간이 걸리는 작업
        Future<Double> future = longTimeWork();

        // 짧은 처리 시간이 걸리는 작업
        shortTimeWork();

        Observable.fromFuture(future)
                .subscribe(data -> Logger.log(LogType.PRINT, "# 긴 처리 시간 작업 결과 : " + data));

        Logger.log(LogType.PRINT, "# end time");
    }



    public static CompletableFuture<Double> longTimeWork(){
        return CompletableFuture.supplyAsync(() -> calculate());
    }

    private static Double calculate() {
        Logger.log(LogType.PRINT, "# 긴 처리 시간이 걸리는 작업 중.........");
        TimeUtil.sleep(6000L);
        return 100000000000000000.0;
    }

    private static void shortTimeWork() {
        TimeUtil.sleep(3000L);
        Logger.log(LogType.PRINT, "# 짧은 처리 시간 작업 완료!");
    }
}
