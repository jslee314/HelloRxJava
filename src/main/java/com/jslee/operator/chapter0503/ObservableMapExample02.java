package com.jslee.operator.chapter0503;

import com.jslee.utils.LogType;
import com.jslee.utils.Logger;
import io.reactivex.Observable;

public class ObservableMapExample02 {
    public static void main(String[] args) {
        Observable.just("korea", "america", "canada", "paris", "japan", "china")
                .filter(country -> country.length() == 5 )
                .map(country -> country.toUpperCase().charAt(0) + country.substring(1))
                .subscribe(data -> Logger.log(LogType.ON_NEXT, data));


    }
}
