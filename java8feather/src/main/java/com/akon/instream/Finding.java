package com.akon.instream;

import com.akon.stream.Dish;

import java.util.Optional;

import static com.akon.stream.Dish.menu;

public class Finding {
    public static void main(String[] args) {
        if (isVegetarianFriendlyMenu()) {
            System.out.println("friend vegetarian");
        }
        System.out.println(isHealthyMenu());
        System.out.println(isHealthyMenu2());

        Optional<Dish> vegetarianDish = findVegetarianDish();
        vegetarianDish.ifPresent(System.out::println);
    }

    private static boolean isVegetarianFriendlyMenu() {
        return menu.stream()
                .anyMatch(Dish::isVegetarian);
    }

    private static boolean isHealthyMenu() {
        return menu.stream()
                .allMatch(dish -> dish.getCalories() < 1000);
    }

    private static boolean isHealthyMenu2() {
        return menu.stream()
                .noneMatch(dish -> dish.getCalories() >= 1000);
    }

    private static Optional<Dish> findVegetarianDish() {
        return menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();
    }
}
