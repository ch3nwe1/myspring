package com.akon.instream;


import com.akon.stream.Dish;

import java.util.Arrays;
import java.util.List;

import static com.akon.stream.Dish.menu;

public class Mapping {
    public static void main(String[] args) {
        menu.stream()
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------");

        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        words.stream()
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------");

        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("----------------------------------------------");

        words = Arrays.asList("Hello", "World");
        words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }
}
