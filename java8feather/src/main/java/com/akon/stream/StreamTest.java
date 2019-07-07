package com.akon.stream;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<String> collect = Dish.menu.stream()
                .filter(dish -> {
                    System.out.println("filtering " + dish.getName());
                    return dish.getCalories() > 300;
                })
                .map(dish -> {
                    System.out.println("mapping " + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(collect);
//
//        Dish.menu.stream().forEach(System.out::println);
//        List<String> title = Arrays.asList("Java8", "In", "Action");
//        Stream<String> stream = title.stream();
//        stream.forEach(System.out::println);
//        stream.forEach(System.out::println);
        Dish.menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
    }

}
