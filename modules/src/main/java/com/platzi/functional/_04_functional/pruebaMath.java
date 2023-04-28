package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class pruebaMath {

    public static void main(String[] args) {

        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));
        System.out.println(square(25));
        System.out.println(square(5));
        System.out.println(isEven.test(2));

        Student estudiante1 = new Student(0.2);
        Student estudiante2 = new Student(3.1);
        System.out.println(aprobado.test(estudiante1));
        System.out.println(aprobado.test(estudiante2));
    }

    private static Integer square(Integer x) {
        return x * x;
    }

    static Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer integer) {
            return integer * integer;
        }
    };

    static Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

    static Predicate<Integer> isEven = x -> x % 2 == 0; //es una funcion que gnera un boolean

    static Predicate<Student> aprobado = student -> student.getCalificacion() > 3.0;

    static class Student {
        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
}
