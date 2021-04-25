package com.jslee.operator.op03_TRANSFORMATION.quiz;


import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Observable;

public class QuizAnswerForChapter050301 {
    public static void main(String[] args) {
        Observable.range(1, 15)
                .filter(num -> num % 2 == 0)
                .map(num -> Math.pow(num, 2))
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));
    }
}
