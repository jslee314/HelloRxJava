package com.jslee.operator.op09_MATHEMATICAL;

import com.jslee.common.SampleData;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;;
import io.reactivex.Observable;

import java.util.Arrays;

/**
 * count을 이용하여 3개 지역에서 측정된 미세먼지 농도의 총 측정 건수를 계산하는 예제
 */
public class CountEx02 {
    public static void main(String[] args) {
        Observable.concat(
                Arrays.asList(
                        Observable.fromIterable(SampleData.seoulPM10List),
                        Observable.fromIterable(SampleData.busanPM10List),
                        Observable.fromIterable(SampleData.incheonPM10List)
                )
        )
        .count()
        .subscribe(data-> Logger.log(LogType.ON_NEXT, data));
    }
}
