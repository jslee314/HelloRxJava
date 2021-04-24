package com.jslee.operator.chapter0502;

import com.jslee.common.CarMaker;
import com.jslee.common.SampleData;
import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Observable;

public class ObservableDistinctExample02 {
    public static void main(String[] args) {
        Observable.fromArray(SampleData.carMakersDuplicated)
                .distinct()
                .filter(carMaker -> carMaker == CarMaker.SSANGYOUNG)
                .subscribe(carMaker -> Logger.log(LogType.ON_NEXT, carMaker));
    }
}
