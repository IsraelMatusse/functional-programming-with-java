package org.example.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        System.out.println(incrementeByOne.apply(1));
        System.out.println(sum.apply(2, 3));
        System.out.println(incrementAndCount.apply(5));
    }
    static Function<Integer, Integer> incrementeByOne= number->number+1;
    static BiFunction<Integer, Integer, Integer>sum= Integer::sum;
    static Function<Integer, Integer> multiplyBy7 = number->number*7;

    static Function<Integer,Integer>incrementAndCount=incrementeByOne.andThen(multiplyBy7);
}
