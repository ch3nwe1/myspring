package com.akon.decorator.starbuzz;

public class StarbuzzCoffee {

    /**
     * outline :
     * Espresso $1.99
     * DarkRoast, Mocha, Mocha,Whip $2.45
     * House Blend Coffee,Soy, Mocha,Whip $2.39
     * @param args
     */
    public static void main(String[] args) {
        //订一杯Espresso，不需要调料，打印出它的价格和描述
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        //顶一杯DarkRoast对象，添加两次Mocha调料，再添加Whip
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        //订一杯HouseBlend的咖啡 再加调料Soy,Mocha, Whip
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
