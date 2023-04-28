package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;

public class NombresUtils {

    public static void main(String[] args) {
        List<String> profesores = getList("JUan", "podro");
        profesores.forEach(System.out::println);
    }

    static <T> List<T> getList(T... elements) {
        return Arrays.asList(elements);
    }
}
