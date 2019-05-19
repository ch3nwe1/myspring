package com.akon.decorator.starbuzz;

public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * @return 调料描述
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }
    @Override
    public double cost() {
        return .80 + beverage.cost();
    }
}
