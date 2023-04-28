package com.platzi.functional._05_sam;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {

    //interfaz de tipo SAM (single abstract method)
    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }

    public static void main(String[] args) {
        Function<Integer, String> addZero = x -> x < 10 ? "0" + x : x.toString();
        TriFunction<Integer, Integer, Integer, LocalDate> parseAge =
                (day, month, year) -> LocalDate.parse(year + "-" +
                        addZero.apply(month) + "-" + addZero.apply(day));
        TriFunction<Integer, Integer, Integer, Integer> calculateAge =
                (day, month, year) -> Period.between(parseAge.apply(day, month, year),
                                LocalDate.now()).getYears();

        System.out.println(calculateAge.apply(22, 12, 1996));
    }
}
