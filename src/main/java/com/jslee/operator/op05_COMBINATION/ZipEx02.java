package com.jslee.operator.op05_COMBINATION;

import com.jslee.common.SampleData;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

import java.util.Arrays;
import java.util.Collections;

/**
 * 서울, 부산, 인천의 시간별 미세먼지 농도를 시간별로 zip한 후, 시간별로 가장 높은 미세먼지 농도를 출력하는 예제
 */
public class ZipEx02 {
    public static void main(String[] args) {
        Observable<Integer> observable1 = Observable.fromIterable(SampleData.seoulPM10List);
        Observable<Integer> observable2 = Observable.fromIterable(SampleData.busanPM10List);
        Observable<Integer> observable3 = Observable.fromIterable(SampleData.incheonPM10List);

        Observable<Integer> observable4 = Observable.range(1, 24);

        Observable.zip(observable1, observable2, observable3, observable4,
                            (data1, data2, data3, hour) -> hour + "시: " + Collections.max(Arrays.asList(data1, data2, data3)))
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
