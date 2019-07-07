package com.akon.instream;

import java.util.Arrays;
import java.util.List;

public class NumericStreams {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 4, 5, 1, 2);
        integers.forEach(System.out::println);

        Integer integer = integers.stream().reduce(0, Integer::sum);
        System.out.println(integer);

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println("--------------------");

        integers.stream().reduce(Integer::max).ifPresent(System.out::println);

        System.out.println("--------------------");

        integers.stream().reduce(Integer::min).ifPresent(System.out::println);

    }
}
