package com.jslee.operator.chapter0504.quiz;

import com.jslee.common.CarMaker;
import com.jslee.common.SampleData;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Observable;
import io.reactivex.Single;

import java.util.Map;

/**
 * toMap 을 이용하여 SampleData.carList 의 car 객체들을 carName을 key로, carMaker를 value로 가지는 Map을 출력하세요.
 */
public class QuizAnswerForChapter050401 {
    public static void main(String[] args) {
        Single<Map<String, CarMaker>> single =
                Observable.fromIterable(SampleData.carList)
                        .toMap(
                                car -> car.getCarName(),
                                car -> car.getCarMaker()
                        );
        single.subscribe(map -> Logger.log(LogType.ON_NEXT, map));
    }




}
