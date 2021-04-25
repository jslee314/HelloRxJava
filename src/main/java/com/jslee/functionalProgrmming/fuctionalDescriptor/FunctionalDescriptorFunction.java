package com.jslee.functionalProgrmming.fuctionalDescriptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * 함수 디스크립터의 Function 예제
 */
public class FunctionalDescriptorFunction {
    public static void main(String[] args) {

        List<Character> characterList = Arrays.asList('a', 'b', 'c', 'd', 'e');
        List<Integer> asciiNumbers = map(characterList, character -> (int) character);

        for(int asciiNumber : asciiNumbers)
            System.out.println(asciiNumber);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f){
        List<R> result = new ArrayList<>();
        for(T t : list)
            result.add(f.apply(t));
        return result;
    }
}
