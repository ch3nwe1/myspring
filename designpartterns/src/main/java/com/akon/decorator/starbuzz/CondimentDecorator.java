package com.akon.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage{

    /**
     * @return 调料描述
     */
    @Override
    public abstract String getDescription();
}
