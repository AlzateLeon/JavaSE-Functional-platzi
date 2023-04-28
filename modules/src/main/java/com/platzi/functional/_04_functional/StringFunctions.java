package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {
        UnaryOperator<String> quote = s -> "\'" + s + "\'";
        UnaryOperator<String> addMark = s -> s + "!";

        System.out.println(quote.apply("hola mundo"));
        System.out.println(addMark.apply("hola mundo"));

        BiFunction<Integer, Integer, Integer> multiplicacion = (integer, integer2) ->  integer * integer2;
        System.out.println(multiplicacion.apply(5,2));
    }
}
