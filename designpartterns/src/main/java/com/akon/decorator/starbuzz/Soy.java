package com.akon.decorator.starbuzz;

public class Soy extends CondimentDecorator{


    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * @return 调料描述
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .50;
    }
}
