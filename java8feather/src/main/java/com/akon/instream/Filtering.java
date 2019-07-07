package com.akon.instream;

import com.akon.stream.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {
    public static void main(String[] args) {
        List<Dish> vegetarianMenu = Dish.menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());

        vegetarianMenu.forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(integer -> integer % 2==0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        Dish.menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-------------------------------------------------");

        Dish.menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .forEach(System.out::println);
    }
}
