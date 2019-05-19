package com.akon.decorator.starbuzz;

public class Decat extends Beverage{

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
