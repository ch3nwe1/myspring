package com.akon.instream;

import com.akon.stream.Dish;

import java.nio.file.Files;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.akon.stream.Dish.*;

/**
 * 数据流
 */
public class DataStream {

    public static void main(String[] args) {
        int sum = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println("sum:" + sum);

        OptionalInt max = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();
        max.ifPresent(value -> System.out.println("max:" + value));

        IntStream intStream = IntStream.rangeClosed(1, 100)
                .filter(value -> value % 2==0);
        System.out.println(intStream.count());

        Stream<int[]> stream = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .filter(b -> Math.sqrt(a * a + b * b) % 1==0)
                        .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}));
        stream.limit(5)
                .forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));

    }

}
